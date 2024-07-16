package servlets;

import java.io.IOException;

import dao.DaoLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

/*O Chamado controller são as servlets / ServletLoginController*/
@WebServlet(urlPatterns = { "/principal/ServletLogin", "/ServletLogin" }) /* Mapeamento de URL que vem da tela */
public class ServletsLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DaoLoginRepository daoLoginRepository = new DaoLoginRepository();

	public ServletsLogin() {
	}

	/* Recebe os dados pela URL em parâmetros */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("logout")) {
			request.getSession().invalidate(); // Invalida a sessão
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			redirecionar.forward(request, response);
			
		}else {
			doPost(request, response);			
		}
				
	}

	/* Recebe os dados enviados por um formulario */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url");

		try {

			if (login != null && !senha.isEmpty() && senha != null && !login.isEmpty()) {
				
				ModelLogin modelLogin = new ModelLogin();
				modelLogin.setLogin(login);
				modelLogin.setSenha(senha);

				if (daoLoginRepository.validarAutenticacao(modelLogin)) { /* Simulando login */
					
					// Limpar a sessão antes de definir o novo usuário
					request.getSession().invalidate();
				    request.getSession().setAttribute("usuario", modelLogin.getLogin()); /* Guarda na sessão */

					if (url == null || url.equals("null")) {
						url = "principal/principal.jsp";
					}

					RequestDispatcher redirecionar = request.getRequestDispatcher(url);
					redirecionar.forward(request, response);

				} else {
					RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
					request.setAttribute("msg", "informe o login e senha corretamente!");
					redirecionar.forward(request, response);
				}

			} else {
				RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
				request.setAttribute("msg", "informe o login e senha corretamente!");
				redirecionar.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher redirecionar = request.getRequestDispatcher("erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
		}
	}

}