<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="../css/alternative.css">


<% String lClass = "its";
   if( request.getParameter( "class" ) != null ) 
   {
      lClass = request.getParameter( "class" );
	  if (!("isis".equals(lClass) || "its".equals(lClass) || "mars".equals(lClass) || "simple".equals(lClass) || "report".equals(lClass) || "mark".equals(lClass)))
	  {
		lClass="";
	  }
   }
   System.out.println("lClass :" + lClass);
   pageContext.setAttribute("tableclass", lClass);
%>



<display:table name="incidentList" id="row" class="${tableclass}" pagesize="2" requestURI="incidentList.action">
    
   
    <display:column property="eventNo" title="Event #"></display:column>
	<display:column property="hopName" title="Hope Name"></display:column>
	<display:column property="regionName" title="Region"></display:column>   
	<display:column property="subCenter" title="Sub-center"></display:column>
	<display:column property="date" title="Date"></display:column>
	<display:column property="problems" title="Problems/Findings"></display:column>
	<display:column property="problemLocation" title="Problem Location"></display:column>
	<display:column property="problemLocationDetails" title="Problem Location Details"></display:column>
	<display:column property="escalationTime" title="Problem Escalation Time"></display:column>
	<display:column property="actionByRSO" title="Action taken by RSO"></display:column>
	<display:column property="actionBySC" title="Action taken by SC"></display:column>
	<display:column property="actionByNC" title="Action taken By NC"></display:column>
	<display:column property="status" title="Incident Status"></display:column>
	<display:column title="Action">
		<a href="<s:url action="../Incident/edit-%{#attr.row.oid}"/>" >Edit</a>
	</display:column>
</display:table>
 
