<%@ page contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript">

	function exportCalendar() {
		console.log("exportCalendar");
		submitPage("<s:url value='/jsp/report/exportCalendarReport.action' />");    
	}
	
</script>

<style>
	
</style>