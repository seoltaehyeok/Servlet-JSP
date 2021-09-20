<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSP의 경우 내장객체가 저장되어 있으므로 Servlet의 
	ServletContext application = getServletContext();
	를 얻어낼 필요가 없다.
 -->
<%
	try {
		int value = (int)application.getAttribute("value");
		value = value + 2;
		application.setAttribute("value", value);
%>	
	<h1><%=value %></h1>
<%
	} catch (NullPointerException e) {
%>
	<h1>설정된 값이 없습니다.</h1>
<%
	}
%>

</body>
</html>