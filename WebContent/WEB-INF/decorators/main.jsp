<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	
	<!-- Optional JavaScript -->
	<script src="<s:url value='resources/js/jquery-3.3.1.slim.min.js'/>" ></script>
	<script src="<s:url value='resources/js/popper.min.js'/>" ></script>
	<script src="<s:url value='resources/js/bootstrap.min.js'/>" ></script>
	
	<!-- Other -->
	<decorator:head/>
</head>

<body>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<a class="navbar-brand" href="<s:url action="page-home" />">Struts</a>
	  	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    	<span class="navbar-toggler-icon"></span>
	  	</button>
	
	  	<div class="collapse navbar-collapse" id="navbarSupportedContent">
	    	<ul class="navbar-nav mr-auto">
	      		<li class="nav-item">
	        		
	      		</li>
	    	</ul>
	    	<ul class="navbar-nav navbar-right">
	    		<li class="nav-item">
	    			<div class="btn-group">
	    				<a class="nav-link" href="<s:url action="page-register" />"><button type="button" class="btn btn-info">Sign up</button></a>
	    				<button type="button" class="btn btn-info disabled">or</button>
	    				<a class="nav-link" href="<s:url action="page-login" />"><button type="button" class="btn btn-info">Sign in</button></a>
	    			</div>
	    			
	    		</li>
	    	</ul>
	  	</div>
	</nav>
	
	<!-- Detail  -->
	<decorator:body/>
	
</body>
</html>