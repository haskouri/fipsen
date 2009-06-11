<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>		
		<c:forEach items="${newsList}" var="news">
			<td style="padding: 10px;">
				<a href="${ctx}/details/<c:out value="${news.newsurl}"/>.action">
					<img height="107" width="107" border="1" src="${ctx}/<c:out value="${news.leadImage.url}"/>" alt="<c:out value="${news.leadImage.altertag}"/>" title="<c:out value="${news.leadImage.title}"/>">
				</a>
			</td>
		</c:forEach>
	</tr>
</table>