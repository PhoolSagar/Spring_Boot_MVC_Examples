<html>
	<head>
		<title>
			JSP Page
		</title>
		<link rel = "stylesheet" href="style.css"/>
	</head>
	<body>
		<%
		java.util.Date date =(java.util.Date ) request.getAttribute("dateTime");
		%>
		<h2>At the server side  date and time is <%= date%></h2>
	</body>
</html>
			