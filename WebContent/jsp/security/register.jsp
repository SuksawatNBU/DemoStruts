<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="resources/css/floating-labels.css">
	
	<style type="text/css">
		.custom{
			background-color: #f2f2f2;
		}
	</style>

</head>
<body>

	<div class="custom">
	  	<s:form class="form-signin" action="signIn" method="post" namespace="/">
	      	
	      	<div class="mb-4" style="color: red">
	      		<s:property value="againMsg" />
	      	</div>
	
	      	<div class="form-label-group">
	        	<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required autofocus>
	        	<label for="inputEmail">Email address</label>
	      	</div>
	
	      	<div class="form-label-group">
	        	<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
	        	<label for="inputPassword">Password</label>
	      	</div>
	
	      	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
	      	<p class="mt-5 mb-3 text-muted text-center">&copy; Suksawat-2018</p>
	    </s:form>
	</div>
	
	
</body>
</html>