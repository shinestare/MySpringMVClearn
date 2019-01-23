<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="command" class="com.bling.model.User" scope="request"></jsp:useBean>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring MVC表单处理</title>
</head>
<body>
	<h2>Spring MVC表单处理</h2>
	<h2>用户信息</h2>
	<form:form method="POST" action="/MySpringMVClearn/adduser">
	   <table>
	      <tr>
	         <td><form:label path="username">用户名：</form:label></td>
	         <td><form:input path="username" /></td>
	      </tr>
	      <tr>
      		<%-- 这里使用<form:password />标签来呈现HTML密码框。 例如 - <form:password path="password" />
				它将呈现以下HTML内容。<input id="password" name="password" type="password" value=""/ --%>
	         <td><form:label path="password">密码：</form:label></td>
	         <td><form:password path="password" /></td>
	      </tr>
	      <tr>
	      	<%-- 这里使用<form:textarea />标签来呈现HTML密码框。 例如 - <form:textarea path="address" rows="5" cols="30" />
				它将呈现以下HTML内容。<textarea id="address" name="address" rows="5" cols="30"> --%>
	         <td><form:label path="address">地址：</form:label></td>
	         <td><form:textarea path="address" rows="5" cols="30" /></td>
	      </tr> 
	      <tr>
	      	<%-- 这里使用<form:checkbox />标签来呈现HTML密码框。 例如 - <form:checkbox path="receivePaper" />
				它将呈现以下HTML内容。<input id="receivePaper1" name="receivePaper" type="checkbox" value="true"/>
									<input type="hidden" name="_receivePaper" value="on"/> --%>
	         <td><form:label path="receivePaper">订阅新闻？</form:label></td>
	         <td><form:checkbox path="receivePaper" /></td>
	      </tr>
	      <tr>
	         <td colspan="2">
	            <input type="submit" value="提交"/>
	         </td>
	      </tr>
	   </table>  
	</form:form>
</body>
</html>