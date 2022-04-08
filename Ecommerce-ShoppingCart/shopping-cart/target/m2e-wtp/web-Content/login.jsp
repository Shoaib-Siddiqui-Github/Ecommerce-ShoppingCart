<%@page import="com.shoaib.connection.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%-- <%
	User auth=(User)request.getSession().getAttribute("auth");
	if(auth!=null){
		/* request.setAttribute("auth",auth); */
		response.sendRedirect("index.jsp");
	}
	%> --%>
<!DOCTYPE html>
<html>
<head>
<title>Shopping Cart login</title>
<%@include file="includes/head.jsp"%>

</head>
<body>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Login</div>
			<div class="card-body">
				<form action="user-login" method="post">

					<div class="form-group">
						<label>Email Address </label> <input type="email"
							class="form-control" name="Login-email"
							placeholder="Enter your Email" required>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="Password"
							class="form-control" name="Login-Password" placeholder="******" required>
					</div>
					<div class="text-center">
						<button type="Submit" class="btn btn-primary">Login</button>
					</div>

				</form>
			</div>
		</div>
	</div>

	<%-- <%@include file="includes/navbar.jsp"%> --%>
	<%@include file="includes/footer.jsp"%>
</body>
</html>