<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<div class="alert alert-primary" role="alert">
			<h2>ActionSupport class</h2>  
			<s:form action="helloAction">
			<div class="input-group mb-3">
			  	<div class="input-group-prepend">
			    	<span class="input-group-text">Name</span>
			  	</div>
			  	<input type="text" name="username" class="form-control">
			</div>
			<button type="submit" class="btn btn-primary" >Submit</button>
			</s:form>
		</div>
	</div>
	
</body>
</html>