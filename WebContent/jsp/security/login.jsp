<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="resources/css/floating-labels.css">
</head>
<body>
	
	
	<div class="text-center mb-4">
		<img class="mb-4" src="resources/img/Struts.png" alt="" width="256" height="86">
		<h2 class="h3 mb-3 font-weight-normal">Struts</h2>
		<p>Apache Struts is a free, open-source, <code> MVC framework </code> for creating elegant, modern Java web applications. It favors convention over configuration, is extensible using a plugin architecture, and ships with plugins to support <code> REST, AJAX and JSON. </code></p>
	</div>
      	
	<div class="mb-4" style="color: red">
		<s:property value="againMsg" />
	</div>
      	
	<s:form class="form-signin" action="signIn" method="post">
      	<div class="form-label-group">
        	<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required autofocus>
        	<label for="inputEmail">Email address</label>
      	</div>

      	<div class="form-label-group">
        	<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        	<label for="inputPassword">Password</label>
      	</div>

      	<div class="checkbox mb-3">
        	<label>
          		<input type="checkbox" value="remember-me"> Remember me
        	</label>
      	</div>
      	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      	<p class="mt-5 mb-3 text-muted text-center">&copy; Suksawat-2018</p>
    </s:form>
	
	
</body>
</html>