<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
 		<link rel="stylesheet" type="text/css" href="../css/new.css"/>
 		<link rel="stylesheet" type="text/css" href="../css/style.css"/>	
 		
		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
		<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<META HTTP-EQUIV="Expires" CONTENT="0">
		<title>Welcome To Fipsen</title>	
</head>	

<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">
	<table style="width: 100%" height="100%" border="0">
		<tr align="center">
			<td colspan="2">
				<table width="100%">
					<tr align="center">
						<td width="100%" colspan="2">
							
							<tiles:insertAttribute name="heading" flush="false">
							</tiles:insertAttribute>
							
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<table>
					<tr>
						<td>
							<tiles:insertAttribute name="images" flush="false">
							</tiles:insertAttribute>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td width="100%" height="100%">
				<table width="100%" height="100%">
					<tr height="100%">
						<td width="100%" height="100%">
							<tiles:insertAttribute name="news" flush="false">
							</tiles:insertAttribute>
						</td>
					</tr>
				</table>
			</td>
			
		</tr>
		
		<tr align="center" class="">
			<td colspan="2">
				<table width="100%">
					<tr align="center">
						<td width="100%">
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