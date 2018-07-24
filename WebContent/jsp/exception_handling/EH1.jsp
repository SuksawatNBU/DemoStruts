<%@ page contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Struts</title>
	<script type="text/javascript">
		function execute() {
			document.forms[0].action = '<s:url value="/jsp/exception_handling/executeExceptionHandling.action"/>';
			document.forms[0].submit();
		}
	</script>
</head>
<body>
	
		<h1>Hello World From Struts2</h1>
      	<s:form method="post">
         	<label for = "name">Please enter your name</label><br/>
         	<input type = "text" name = "name"/>
         	<button type="submit" onclick="execute()" >Submit</button>
      	</s:form>
      
</body>
</html>