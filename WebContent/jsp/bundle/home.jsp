<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Struts</title>
</head>
<body>

	<s:form action="welcome">
		<s:textfield key="global.username" name="username" label="User Name" />
		<s:textfield key="global.address" name="address" label="Address" />
		<s:select list="{'en_US','fr_FR','de_DE'}" name="appLocale" key="global.selectlocale" label="Locale" />
		<s:submit key="global.submit" name="submit" value="Submit" />
	</s:form>
	
</body>
</html>