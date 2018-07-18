<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.container {
			min-width: 300px;
		}
		a:link {
			text-decoration: none;
		}
		.list-group-item:HOVER {
			background-color: #f2f2f2;
		}
	</style>
</head>
<body>

	<div class="container" style="margin-top: 20px;">
		
		<h3>Struts 2 Tutorial</h3>
		<div class="list-group">
		  	<a class="list-group-item" href="<s:url action="page-interceptor" />">Interceptors</a>
		  	<a class="list-group-item" href="<s:url action="page-bundle" />">Results - Result Types</a>
		  	<a class="list-group-item" href="<s:url action="page-bundle" />">Value Stack/OGNL</a>
		  	<a class="list-group-item" href="<s:url action="page-bundle" />">Localization, internationalization </a>
		  	<a class="list-group-item" href="<s:url action="page-bundle" />">Bundle</a>
		</div>

	</div>
	
</body>
</html>