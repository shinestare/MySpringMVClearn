<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring MVC表单处理结果页面</title>
</head>
<body>
	<h2>Spring MVC表单处理之-密码</h2>
	<h2>提交的用户信息</h2>
   	<table>
      <tr>
         <td>用户名：</td>
         <td>${username}</td>
      </tr>
      <tr>
         <td>密码：</td>
         <td>${password}</td>
      </tr> 
      <tr>
         <td>地址：</td>
         <td>${address}</td>
      </tr> 
   	</table>
</body>
</html>