<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table width="100%" border="0" cellpadding="10" cellspacing="10" >
	<div>
		<h4>Top Celebrities</h4>
	</div>
	<tr>
		<td>
			<c:forEach items="${topCelebrityList}" var="topCelebrity">
				<div style="padding: 10px; top: 0px; letter-spacing: 1px; padding-left: 100px;">
				<a href="${ctx}/search/search.action?key=<c:out value="${topCelebrity.firstName}"/>.action" target="_blank">
					<c:out value="${topCelebrity.position}"></c:out>
					<c:out value="   "></c:out>
					<c:out value="${topCelebrity.firstName}"></c:out>					
				</a>
			</div>
			</c:forEach>
		</td>
	</tr>
</table>
	
	