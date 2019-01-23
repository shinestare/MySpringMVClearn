<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>首页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  
  <body>
    <h2>Spring MVC首页</h2>
    <form:form method="GET" action="/MySpringMVClearn/staticPage">
    	<table>
    		<tr>
    			<td>
    				<input type="submit" value="获取HTML静态页面"/>
    			</td>
    		</tr>
    	</table>
    </form:form>
    <br />
    <br />
    <h2>Spring MVC页面重定向</h2>
    <p>点击下面的按钮将结果重定向到新页面</p>
    <form:form method="GET" action="/MySpringMVClearn/pageRedirect">
        <table>
            <tr>
                <td><input type="submit" value="页面重定向" /></td>
            </tr>
        </table>
    </form:form>
  </body>
</html>
