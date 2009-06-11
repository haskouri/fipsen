<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
	
		<link rel="stylesheet" type="text/css" href="../pages/styles/style.css">
		<link rel="stylesheet" type="text/css" href="../pages/styles/login style.css">		
 
 		<!-- VERTICAL Menu Creation -->
		<link rel="stylesheet" type="text/css" href="../styles/cssverticalmenu.css" />
		<script type="text/javascript" src="../javascript/cssverticalmenu.js"></script>
		

		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
		<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<META HTTP-EQUIV="Expires" CONTENT="0">
		<title>WBMS</title>	
</head>	
<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">
	<table border="0" width="100%"  cellpadding="0" cellspacing="0" align="center">
		<tr>
			<td width="100%" height="10%" align="center">
				<table width="100%" border="0" height="10%" align="center">
					<tr>
						<td style="background: white;">
							<tiles:insertAttribute name="header" flush="false">
							</tiles:insertAttribute>
						</td>
					</tr>
				</table>
			</td>				
		</tr>
		<tr>
			<td width="100%" height="80%" align="center">
				<table width="100%" border="0" height="80%" align="center">
					<tr>
						<td style="background: white;">
							<tiles:insertAttribute name="body" flush="false">
							</tiles:insertAttribute>
						</td>
					</tr>
				</table>
			</td>				
		</tr>
		<tr>
			<td width="100%" height="10%" align="center">
				<table width="100%" border="0" height="10%" align="center">
					<tr>
						<td style="background: white;">

							<tiles:insertAttribute name="footer" flush="false">
							</tiles:insertAttribute>

						</td>
					</tr>
				</table>
			</td>				
		</tr>
	</table>
</body>
</html>	