<html>
	<head>
		<title>
			JSP Page
		</title>
		<link rel = "stylesheet" href="style.css"/>
	</head>
	<body>
	<%
	boolean result = (boolean)request.getAttribute("result");
	if(result){
		out.println("<p>First no : " + request.getAttribute("fno") + "</p>");
		out.println("<p>second no : " + request.getAttribute("sno")+ "</p>");
		out.println("<p>Their sum : " + request.getAttribute("sum")+ "</p>");
	}else{
		out.println("Exception : Enter number only");
	}
	%>
	
	</body>
</html>
			