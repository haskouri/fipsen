<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/new.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />

<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0">

<title>Welcome To Fipsen</title>
</head>

<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0"
	marginwidth="0" marginheight="0">

<script>
	var milisec = 0
	var seconds = 300

	function display() {
		if (milisec <= 0) {
			milisec = 9
			seconds -= 1
		}
		if (seconds <= -1) {
			milisec = 0
			seconds += 1
		} else
			milisec -= 1
		if (milisec == 0 && seconds == 0) {
			window.location.reload()
		}
		setTimeout("display()", 100)
	}
	display()
</script>
<script language="JavaScript" type="text/javascript" src="/fipsen/js/fadomatic.js"></script>
<script language="JavaScript" type="text/javascript" src="/fipsen/js/rotating-banner.js"></script>
<link rel="stylesheet" rev="stylesheet" href="/fipsen/css/rotating-banner.css" />

<table style="width: 100%" border="0">

	<tr align="center">
		<td width="100%" colspan="2">
		<table width="100%">
			<tr align="center">
				<td width="100%">
					<tiles:insertAttribute name="banner" flush="false">
					</tiles:insertAttribute>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr align="center">
		<td width="100%" colspan="2">
		<table width="100%">
			<tr align="center">
				<td width="100%">
					<tiles:insertAttribute name="heading" flush="false">
					</tiles:insertAttribute>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	
	
	<tr>
		<td width="100%">
		<table border="0">
			<tr align="center">
				<td width="100%" colspan="2">
					<table width="100%">
						<tr align="center">
							<td width="100%" colspan="2">
								<tiles:insertAttribute name="search" flush="false">
								</tiles:insertAttribute>
							</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td width="100%">
					<table>
						<tr>
							<td colspan="2" align="center">
								<tiles:insertAttribute name="images" flush="false">
								</tiles:insertAttribute>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr>
				<td width="50%">
				<table>
					<tr>
						<td><tiles:insertAttribute name="news" flush="false">
						</tiles:insertAttribute></td>
					</tr>
					<tr>
						<td>
						<div class="watch-discoverbox"
							style="height: 302px; width: 300px;"><tiles:insertAttribute
							name="topTen" flush="false">
						</tiles:insertAttribute></div>
						</td>
					</tr>
				</table>
				</td>
				<td width="50%">
				<table>
					<tr>
						<td>
						<h6>Today's Favorite Videos from <strong><a
							href="http://www.youtube.com" target="_blank">youtube</a></strong></h6>
						<div class="watch-discoverbox"
							style="height: 302px; width: 300px;"><tiles:insertAttribute
							name="videos" flush="false">
						</tiles:insertAttribute></div>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
		<td style="border: 0">
		<table style="border: 0">
			<tr>
				<td>
					<tiles:insertAttribute name="adv" flush="false">
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
					<tiles:insertAttribute name="footerAdv"
						flush="false">
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
				<td width="100%"><tiles:insertAttribute name="footer"
					flush="false">
				</tiles:insertAttribute></td>
			</tr>
		</table>
		</td>
	</tr>

</table>

</body>
</html>