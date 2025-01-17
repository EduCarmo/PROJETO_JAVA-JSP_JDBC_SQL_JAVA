<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"></jsp:include>

<body>

	<!-- Pre-loader start -->
	<jsp:include page="theme-loader.jsp"></jsp:include>

	<!-- Pre-loader end -->
	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">
			
			<!-- navbar start -->
			<jsp:include page="navbar.jsp"></jsp:include>
			
			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">
					<jsp:include page="navbarMainMenu.jsp"></jsp:include>
					<div class="pcoded-content">
					
						<!-- Page-header start -->
						<jsp:include page="page-head.jsp"></jsp:include>
						
						<!-- Page-header end -->
						<div class="pcoded-inner-content">
							<!-- Main-body start -->
							<div class="main-body">
								<div class="page-wrapper">
									<!-- Page-body start -->
									<div class="page-body">
										<div class="row">
											<!-- task, page, download counter  start -->
											<h1>Conteúdo da pagina do sistema</h1>
											<!--  project and team member end -->
										</div>
									</div>
									<!-- Page-body end -->
								</div>
								<div id="styleSelector"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Required Jquery -->

	<jsp:include page="javascriptFile.jsp"></jsp:include>

</body>

</html>
