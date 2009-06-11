<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<form action="<c:url value='/search/search.action'/>">
	<input type='text' name="key"/>
	<input type="submit" value="Search" />
</form>

