<%@ page language="java" contentType="text/html; charset=UTF-8" 
import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆</title>
  </head>
  
  <body>
    <form action="login.html" method="post">
    	<p>
    		用户名：<input name="username" type="text">
    	</p>
    	<p>
    		密&nbsp;&nbsp;码：<input name="password" type="password">
    	</p>
    	<p>
    		<input type="submit">
    	</p>
    </form>
    <font color="red">${error}</font>
    
  </body>
</html>
