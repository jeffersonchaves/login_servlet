<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${pageContext.request.contextPath}
	
	 

	<form action="${pageContext.request.contextPath}/login" >
		
		<input type="text" name="campo_login"  />
		<input type="password" name="campo_password"  />
		
		<input type="submit" value="logar" />
	
	</form>

</body>
</html>