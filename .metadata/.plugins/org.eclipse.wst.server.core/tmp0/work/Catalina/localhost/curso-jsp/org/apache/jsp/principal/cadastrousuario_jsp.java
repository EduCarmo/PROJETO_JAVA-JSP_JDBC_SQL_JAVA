/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.18
 * Generated at: 2024-03-17 16:53:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.principal;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class cadastrousuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1602874032000L));
    _jspx_dependants.put("jar:file:/E:/Eduardo/Formação%20Java%20Web%20Full%20Stack/PROJETO_JAVA%20JSP_JDBC_SQL_JAVA/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/curso-jsp/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602884772000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- Pre-loader start -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "theme-loader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Pre-loader end -->\r\n");
      out.write("	<div id=\"pcoded\" class=\"pcoded\">\r\n");
      out.write("		<div class=\"pcoded-overlay-box\"></div>\r\n");
      out.write("		<div class=\"pcoded-container navbar-wrapper\">\r\n");
      out.write("\r\n");
      out.write("			<!-- navbar start -->\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"pcoded-main-container\">\r\n");
      out.write("				<div class=\"pcoded-wrapper\">\r\n");
      out.write("					");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbarMainMenu.jsp", out, false);
      out.write("\r\n");
      out.write("					<div class=\"pcoded-content\">\r\n");
      out.write("\r\n");
      out.write("						<!-- Page-header start -->\r\n");
      out.write("						");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "page-head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!-- Page-header end -->\r\n");
      out.write("						<div class=\"pcoded-inner-content\">\r\n");
      out.write("							<!-- Main-body start -->\r\n");
      out.write("							<div class=\"main-body\">\r\n");
      out.write("								<div class=\"page-wrapper\">\r\n");
      out.write("									<!-- Page-body start -->\r\n");
      out.write("									<div class=\"page-body\">\r\n");
      out.write("										<!-- task, page, download counter  start -->\r\n");
      out.write("\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-sm-12\">\r\n");
      out.write("												<!-- Basic Form Inputs card start -->\r\n");
      out.write("												<div class=\"card\">\r\n");
      out.write("													<div class=\"card-block\">\r\n");
      out.write("														<h4 class=\"sub-title\">Cadastro de usuário</h4>\r\n");
      out.write("\r\n");
      out.write("														<form class=\"form-material\"\r\n");
      out.write("															action=\"");
      out.print(request.getContextPath());
      out.write("/ServletsUsuarioController\"\r\n");
      out.write("															method=\"post\" id=\"formUser\">\r\n");
      out.write("\r\n");
      out.write("															<input type=\"hidden\" name=\"acao\" id=\"acao\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"text\" name=\"id\" id=\"id\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modelLogin.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("																	readonly=\"readonly\"> <span class=\"form-bar\"></span>\r\n");
      out.write("																<label class=\"float-label\">ID:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div class=\"form-group form-default \">\r\n");
      out.write("																<input type=\"text\" name=\"nome\" id=\"nome\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modelLogin.nome}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("																	required=\"required\"> <span class=\"form-bar\"></span>\r\n");
      out.write("																<label class=\"float-label\">Nome:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div class=\"form-group form-default\">\r\n");
      out.write("																<input type=\"text\" name=\"email\" id=\"email\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modelLogin.email}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("																	required=\"required\" autocomplete=\"off\"> <span\r\n");
      out.write("																	class=\"form-bar\"></span> <label class=\"float-label\">E-mail:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div class=\"form-group form-default\">\r\n");
      out.write("																<input type=\"text\" name=\"login\" id=\"login\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modelLogin.login}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("																	required=\"required\" autocomplete=\"off\"> <span\r\n");
      out.write("																	class=\"form-bar\"></span> <label class=\"float-label\">Login:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div class=\"form-group form-default\">\r\n");
      out.write("																<input type=\"password\" name=\"senha\" id=\"senha\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modelLogin.senha}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("																	required=\"required\" autocomplete=\"off\"> <span\r\n");
      out.write("																	class=\"form-bar\"></span> <label class=\"float-label\">Senha:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<button type=\"button\" class=\"btn btn-primary waves-effect waves-light\" onclick=\"limparForm();\">Novo</button>\r\n");
      out.write("															<button class=\"btn btn-success waves-effect waves-light\">Salvar</button>\r\n");
      out.write("															<button type=\"button\" class=\"btn btn-danger waves-effect waves-light\" onclick=\"deleteUser();\">Excluir</button>\r\n");
      out.write("															<button type=\"button\" class=\"btn btn-secondary\" data-toggle=\"modal\" data-target=\"#exampleModalUsuario\">Pesquisar</button>\r\n");
      out.write("\r\n");
      out.write("														</form>\r\n");
      out.write("\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<span id=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("										<!--  project and team member end -->\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- Page-body end -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"styleSelector\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("		<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"exampleModalUsuario\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("	    <div class=\"modal-content\">\r\n");
      out.write("	      <div class=\"modal-header\">\r\n");
      out.write("	        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Pesquisa de usuário</h5>\r\n");
      out.write("	        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("	          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("	        </button>\r\n");
      out.write("	      </div>\r\n");
      out.write("	      <div class=\"modal-body\">\r\n");
      out.write("	      \r\n");
      out.write("	      <div class=\"input-group mb-3\">\r\n");
      out.write("  			<input type=\"text\" class=\"form-control\" placeholder=\"Nome\" aria-label=\"nome\" id=\"nomeBusca\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("  				<div class=\"input-group-append\">\r\n");
      out.write("    				<button class=\"btn btn-success\" type=\"button\" onclick=\"buscarUsuario();\">Buscar</button>\r\n");
      out.write("  				</div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		  \r\n");
      out.write("		  <div style=\"height: 300px; overflow: scroll;\">\r\n");
      out.write("			  <table class=\"table table-striped\" id=\"tabelaresultados\">\r\n");
      out.write("				  <thead>\r\n");
      out.write("				    <tr>\r\n");
      out.write("				      <th scope=\"col\">ID</th>\r\n");
      out.write("				      <th scope=\"col\">Nome</th>\r\n");
      out.write("				      <th scope=\"col\">Ver</th>\r\n");
      out.write("				    </tr>\r\n");
      out.write("				  </thead>\r\n");
      out.write("				  <tbody>\r\n");
      out.write("	\r\n");
      out.write("				  </tbody>\r\n");
      out.write("			  </table>	 \r\n");
      out.write("		  </div>\r\n");
      out.write("		  <samp id=\"totalResultados\"></samp>\r\n");
      out.write("		        \r\n");
      out.write("	    \r\n");
      out.write("	      </div>\r\n");
      out.write("	      <div class=\"modal-footer\">\r\n");
      out.write("	        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\r\n");
      out.write("	      </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- Required Jquery -->\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javascriptFile.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	function verEditar(id) {\r\n");
      out.write("		\r\n");
      out.write("		var urlAction = document.getElementById('formUser').action;\r\n");
      out.write("		window.location.href = urlAction + '?acao=buscarEditar&id=' + id;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function buscarUsuario() {\r\n");
      out.write("		var nomeBusca = document.getElementById('nomeBusca').value;\r\n");
      out.write("		\r\n");
      out.write("		if(nomeBusca != null && nomeBusca != '' && nomeBusca.trim() != ''){ /*Validando que tem que ter valor para buscar no banco de dados*/\r\n");
      out.write("							\r\n");
      out.write("			var urlAction = document.getElementById('formUser').action;\r\n");
      out.write("						\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				method : \"get\",\r\n");
      out.write("				url : urlAction,\r\n");
      out.write("				data : \"nomeBusca=\" + nomeBusca + '&acao=buscarUserAjax',\r\n");
      out.write("				success : function(response) {\r\n");
      out.write("					\r\n");
      out.write("					var json = JSON.parse(response);\r\n");
      out.write("					\r\n");
      out.write("					$('#tabelaresultados > tbody > tr').remove();\r\n");
      out.write("					\r\n");
      out.write("					for(var p = 0; p < json.length; p++){\r\n");
      out.write("						$('#tabelaresultados > tbody').append('<tr> <td>'+json[p].id+'</td> <td>'+json[p].nome+'</td> <td> <button onclick=\"verEditar('+json[p].id+');\" type=\"button\" class=\"btn btn-info\">Ver</button></td> </tr>');\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					document.getElementById('totalResultados').textContent = 'Resultados econtrados: ' + json.length;\r\n");
      out.write("					\r\n");
      out.write("				}\r\n");
      out.write("			}).fail(\r\n");
      out.write("					function(xhr, status, errorThrown) {\r\n");
      out.write("						alert('Erro ao buscar usuário por nome: ' + xhr.responseText);\r\n");
      out.write("					});\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	function deleteUser() {\r\n");
      out.write("		if (confirm('Deseja realmente excluir os dados?')) {\r\n");
      out.write("			var urlAction = document.getElementById('formUser').action;\r\n");
      out.write("			var idUser = document.getElementById('id').value;\r\n");
      out.write("\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				method : \"get\",\r\n");
      out.write("				url : urlAction,\r\n");
      out.write("				data : \"id=\" + idUser + '&acao=deletarajax',\r\n");
      out.write("				success : function(response) {\r\n");
      out.write("					limparForm()\r\n");
      out.write("					document.getElementById('msg').textContent = response;\r\n");
      out.write("				}\r\n");
      out.write("			}).fail(\r\n");
      out.write("					function(xhr, status, errorThrown) {\r\n");
      out.write("						alert('Erro ao deletar usuário por id: ' + xhr.responseText);\r\n");
      out.write("					});\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	//Deletar pelo sem ser por ajax\r\n");
      out.write("	function deletarUser() {\r\n");
      out.write("\r\n");
      out.write("		if (confirm('Deseja realmente exluir os dados? ')) {\r\n");
      out.write("			document.getElementById(\"formUser\").method = \"get\";\r\n");
      out.write("			document.getElementById(\"acao\").value = \"deletar\";\r\n");
      out.write("			document.getElementById(\"formUser\").submit();\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function limparForm() {\r\n");
      out.write("		var elementos = document.getElementById(\"formUser\").elements;\r\n");
      out.write("		for (var i = 0; i < elementos.length; i++) {\r\n");
      out.write("			var element = elementos[i];\r\n");
      out.write("			if (element.type !== \"button\") { // Evita limpar botões\r\n");
      out.write("				element.value = ''; // Limpa o valor do campo\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}