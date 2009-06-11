<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr><td>
	
	<div align="center">
		<c:forEach items="${videoList}" var="videos">
			
			<a href="<c:out value="${videos.videourl}"/>" target="_blank">
					<img height="107" width="107" border="1" src="<c:out value="${videos.leadImage.url}"/>" alt="<c:out value="${videos.leadImage.altertag}"/>" title="<c:out value="${videos.leadImage.title}"/>">
			</a>
			
			<br>
			<a href="<c:out value="${videos.videourl}"/>" target="_blank"><c:out value="${videos.details}"/></a>
			<br>
			<br>
			
		</c:forEach>
	</div>
	</td></tr>
</table>