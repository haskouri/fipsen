<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table width="100%" border="0" cellpadding="10" cellspacing="10" >
	<tr><td>
	
		<c:forEach items="${newsList}" var="news">
			<div style="padding: 10px; top: 0px; letter-spacing: 1px; padding-left: 100px;">
				<a href="${ctx}/details/<c:out value="${news.newsurl}"/>.action">
					<c:out value="${news.heading}"></c:out>
				</a>
			</div>
							
		</c:forEach>
	
	</td></tr>
</table>