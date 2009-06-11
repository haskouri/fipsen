<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<div class="editorialfeature">
    <% int i = 0; %>
    <c:forEach items="${advertisement.banner}" var="banner">
    <div id="editorialFeature_frame<%=i%>" class="editorialfeatureframe" align="center">
        <a href="${banner.url}"><img src="${ctx}/<c:out value="${banner.image}"/>" border="0"/></a>
    </div>
    <%i = i+1; %>
    </c:forEach>
    
    <script type="text/javascript">
        nStories = <%=i%>;
        initStories('editorialFeature_frame');
    </script>
</div>