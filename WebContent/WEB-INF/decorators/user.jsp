<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

	<!-- Required meta tags -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<s:include value="/resources/css/custom-css.jsp"/>
	
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
		<span class="navbar-brand">Struts</span>
	  	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    	<span class="navbar-toggler-icon"></span>
	  	</button>
	
	  	<div class="collapse navbar-collapse" id="navbarSupportedContent">
	    	<ul class="navbar-nav mr-auto">

	    	</ul>
	    	<ul class="navbar-nav navbar-right">
	    		<li class="nav-item nav-link">
	    			<span class="navbar-text">Wellcome : <s:property value="user.name"/></span>
	    		</li>
	    		<li class="nav-item">
	    			<a class="nav-link" href="<s:url namespace="/" action="signOut" />"><button type="button" class="btn btn-info">sign out</button></a>
	    		</li>
	    	</ul>
	  	</div>
	</nav>
	
	<!-- Detail  -->
	<decorator:body/>
	
	<!-- Footer -->
	<footer class="pt-4 my-md-5 pt-md-5 border-top">
        <div class="row">
        	
        </div>
	</footer>
	
	
</body>
</html>