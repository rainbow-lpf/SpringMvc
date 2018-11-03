<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/upload/uploadfile.do" method="post" enctype="multipart/form-data">
	
  <h2>单上传文件</h2>
  <p>  <input type="file" name="file1" /> </p>

  <p>  <input type="submit"  value="上传文件"/> </p>
  
</form>


<form action="${pageContext.request.contextPath }/upload/uploadfiles.do" method="post" enctype="multipart/form-data">
	
  <h2>多上传文件</h2>
  	<p>  <input type="file" name="file" /> </p>
  
   	<p>  <input type="file" name="file" /> </p>
   
    <p>  <input type="file" name="file" /> </p>
    

  <p>  <input type="submit"  value="上传文件"/> </p>
  
</form>

</body>
</html>