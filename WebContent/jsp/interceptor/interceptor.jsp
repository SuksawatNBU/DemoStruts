<%@ page contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Interceptor</title>
</head>
<body>
	
	<h1>Hello World From Struts2</h1>
	<s:form action ="execute" namespace="/jsp/interceptor">
         <label for = "name">Please enter your name</label><br/>
         <input type = "text" name = "name"/>
         <input type = "submit" value = "Say Hello"/>
	</s:form>
	
</body>
</html>