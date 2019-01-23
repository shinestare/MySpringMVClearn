<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:useBean id="command" class="com.bling.model.Student" scope="request"></jsp:useBean>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring MVC表单处理</title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form method="POST" action="/MySpringMVClearn/addstudent">
		<table>
			<tr>
				<%-- 这里使用<form:input />标签来渲染一个HTML文本框。示例 - <form:input path="name" />
					它将生成以下HTML内容。<input id="name" name="name" type="text" value=""/> --%>
				<td><form:label path="name">名字：</form:label></td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td><form:label path="age">年龄：</form:label></td>
				<td><form:input path="age"/></td>
			</tr>
			<tr>
				<td><form:label path="id">编号：</form:label></td>
				<td><form:input path="id"/></td>
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