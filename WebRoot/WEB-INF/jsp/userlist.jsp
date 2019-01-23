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
      <tr>
         <td>是否订阅新闻</td>
         <td>${receivePaper}</td>
      </tr> 
      <tr>
         <td>喜欢的技术/框架</td>
         <td> <% String[] favoriteFrameworks = (String[])request.getAttribute("favoriteFrameworks");
            for(String framework: favoriteFrameworks) {
               out.println(framework);
            }
         %></td>
      </tr>
      <tr>
		<td>性别：</td>
		<td>${(gender=="M"? "男" : "女")}</td>
	  </tr>
	  <tr>
         <td>喜欢的数字：</td>
         <td>${favoriteNumber}</td>
      </tr>
      <tr>
         <td>国家：</td>
         <td>${country}</td>
      </tr>
      <tr>
	      <td>技术：</td>
	      <td>
	          <%
	              String[] skills = (String[]) request.getAttribute("skills");
	                  for (String skill : skills) {
	                      out.println(skill);
	                  }
	          %>
	      </td>
      </tr>
   	</table>
</body>
</html>