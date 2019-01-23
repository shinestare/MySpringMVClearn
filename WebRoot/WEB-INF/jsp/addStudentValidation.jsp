<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring MVC表单错误处理</title>
</head>
<style>
	.error {
	    color: #ff0000;
	}
	
	.errorStyle {
	    color: #000;
	    background-color: #ffEEEE;
	    border: 3px solid #ff0000;
	    padding: 8px;
	    margin: 16px;
	}
</style>
<body>
	<h2>学生信息</h2>
	<form:form method="POST" action="/MySpringMVClearn/addStudentValidation" commandName="studentValidation">
		<table>
			<tr>
				<%-- 这里使用<form:errors />标签来呈现HTML隐藏字段域。 
				例如 - <form:errors path="*" cssClass="errorblock" element="div" />
				它将呈现所有输入验证的错误消息。
				使用带有path =“name”的<form：errors />标记来渲染name字段的错误消息。
				<form:errors path="name" cssClass="error" />
					它将呈现名称字段验证的错误消息。 --%>
				<td><form:label path="name">姓名：</form:label></td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
                <td><form:label path="age">年龄：</form:label></td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td><form:label path="id">编号：</form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交" /></td>
            </tr>
		</table>
	</form:form>
</body>
</html>