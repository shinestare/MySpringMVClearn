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
	      	<%-- 这里使用<form:checkboxes />标签来呈现HTML多个复选框。 例如 - --%>
	      	<td><form:label path="favoriteFrameworks">喜欢的框架：</form:label></td>
	      	<td><form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks" /></td>
	      </tr>
	      <tr>
	      	<%-- 这里使用<form:radiobutton />标签来呈现HTML密码框。 
	      	例如 - 	<form:radiobutton path="gender" value="M" label="男" />
					<form:radiobutton path="gender" value="F" label="女" />
			它将呈现以下HTML内容。
					<input id="gender1" name="gender" type="radio" value="M" checked="checked"/><label for="gender1">男</label>
					<input id="gender2" name="gender" type="radio" value="F"/><label for="gender2">女</label> --%>
	      	<td><form:label path="gender">性别：</form:label></td>
	      	<td><form:radiobutton path="gender" value="M" label="男" />
				<form:radiobutton path="gender" value="F" label="女" />
			</td>
	      </tr>
	      <tr>
		      	<%-- 这里使用<form:radiobuttons />标签来呈现HTML密码框。 
		      		例如 - <form:radiobuttons path="favoriteNumber" items="${numbersList}" /> --%>
	           <td><form:label path="favoriteNumber">喜欢的数字：</form:label></td>
	           <td><form:radiobuttons path="favoriteNumber" items="${numbersList}" /></td>
          </tr>
          <tr>
          		<%-- 这里使用<form:select /> , <form:option /> 和 <form:options />标签来呈现HTML下拉选项。
          			 例如 - <form:select path="country">
						   <form:option value="NONE" label="Select"/>
						   <form:options items="${countryList}" />
						</form:select>
					它将呈现以下HTML内容。
							<select id="country" name="country">
						   <option value="NONE">请选择...</option>
						   <option value="US">United States</option>
						   <option value="CH">China</option>
						   <option value="MY">Malaysia</option>
						   <option value="SG">Singapore</option>
						</select> --%>
              <td><form:label path="country">所在国家：</form:label></td>
              <td><form:select path="country">
                      <form:option value="NONE" label="请选择..." />
                      <form:options items="${countryList}" />
                  </form:select></td>
          </tr>
          <tr>
          	  <%-- 这里使用<form:select /> 及其属性 multiple=true标签来呈现HTML列表多选框 --%>
              <td><form:label path="skills">技术：</form:label></td>
              <td><form:select path="skills" items="${skillsList}" multiple="true" /></td>
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