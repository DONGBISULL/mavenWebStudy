<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4> 지역적 에러 처리 방법에 따라 사용되는 에러 페이지</h4>

<pre>
	<%
		exception.printStackTrace();
		ErrorData ed = pageContext.getErrorData();
	%>
	
	<%=exception.getMessage() %>
	<%=ed.getRequestURI() %>//exeption 어디서 발생했는지 알 수 있음 
	<%=ed.getStatusCode() %>
	<%=ed.getThrowable()==exception %>
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!
	좀따 보면 또 졸고 있을거지?!?!?!?!??!

</pre>
</body>
</html>