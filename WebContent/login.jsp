<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/user/login.do" method="post">
<table>
	<tr>
		<td>姓名：<input type="text" name="userName" /></td>
		<td>密码：<input type="password" name="userPassword" /></td>
	</tr>
	<tr>
      <td><input type="submit" value="提交"/></td>
	</tr>
</table>
</form>
</body>
</html>