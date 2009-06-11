<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />



<table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>	
		<td style="padding: 10px;">	
		<c:forEach items="${advertisement.upperAds}" var="adv">
			<a href="${adv.url}" target="_blank">
				<img height="${adv.height}" width="${adv.width}" border="1" src="${ctx}/<c:out value="${adv.image}"/>">
			</a>
			
		</c:forEach>
		</td>
	</tr>
</table>