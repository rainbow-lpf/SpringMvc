<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="${pageContext.request.contextPath }/student/update.do" method="post">
   	 <lable>姓名:</lable><input type="text" name="name" value="${student.name}" />
   	 <lable>年龄:</lable><input type="text" name="age" value="${student.age }" />
   	  <input type="text" name="id" style="display:none" value="${student.id }" />
   	 <button type="submit">提交</button>
   </form>
</body>
</html>