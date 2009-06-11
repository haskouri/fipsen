<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:set var="ctx" value="${pageContext.request.contextPath}" />

<table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
	
	<tr>
		<td>
		 	<h3 style="font-size: medium">
				<c:out value="${news.heading}"></c:out>
			</h3>
		</td>
	</tr>
	
	<tr>
		<td>
			<img border="1" src="${ctx}/<c:out value="${news.leadImage.url}"/>" alt="<c:out value="${news.leadImage.altertag}"/>" title="<c:out value="${news.leadImage.title}"/>">
		</td>
	</tr>
	
	
	<tr>
		<td>
			<c:out value="${news.details}"></c:out>
		</td>
	</tr>


</table>
