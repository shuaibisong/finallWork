<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="CourseUpdateServlet" method="post">
    请输入想要修改的课程编号：<input type="text" name="id">
    请输入修改课程名：<input type="text" name="cname">
    请输入修改授课老师：<input type="text" name="cteacher">
    请输入修改课程学分：<input type="text" name="ccredit">
    <input type="submit" value="提交" >
</form>
</body>
</html>
