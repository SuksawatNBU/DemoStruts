<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	
		<h4>s:property</h4>
		<div class="alert alert-primary">
			<s:property value="getText('action.welcome.title')"/><br/>
			<s:property value="getText('action.welcome.username')"/>: <s:property value="username"/><br>
		</div>
		
		<h4>s:text</h4>
		<div class="alert alert-primary">
		  	<s:text name="action.welcome.address"></s:text>: <s:property value="address"/><br><br>
		</div>
		
		<h4>s:i18n</h4>
		<div class="alert alert-primary">
		  	<s:i18n name="global">
				<s:text name="action.welcome.thankyou"></s:text>
			</s:i18n>
		</div>
	
</body>
</html>