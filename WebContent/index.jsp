<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.input-group {
			max-width: 500px;
			min-width: 300px;
		}
		.container {
			min-width: 300px;
		}
		.alert {
			min-width: 300px;
		}
	</style>
</head>
<body>

	<div class="container" style="margin-top: 20px;">
		
		<ul class="nav flex-column">
		  <li class="nav-item">
		    <a class="nav-link" href="<s:url namespace="/jsp" action="page-bundle" />">Bundle</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="#">Link</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="#">Link</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link disabled" href="#">Disabled</a>
		  </li>
		</ul>

	</div>
	
</body>
</html>