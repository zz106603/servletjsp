<%-- page 지시자 --%>

<%@ page contentType="text/html; charset=UTF-8"%>

<%-- 템플릿 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>view02</h1>
	<hr />
	<%-- 스크립트릿 --%>
	<%
		String name = "JSP 입니다.";
	%>
	
	<%-- 표현식 --%>
	<%=name%>
	
	<%for(int i=1; i<=6; i++){%>
		<h<%=i%>><%=name%></h<%=i%>>
	<%}%>
</body>
</html>