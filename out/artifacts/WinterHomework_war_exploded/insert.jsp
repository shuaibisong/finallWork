<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加课程</title>
</head>
<body>
     <form action="CourseInsertServlet" method="post">
    请输入添加的课程名：<input type="text" name="cname">
    请输入授课老师：<input type="text" name="cteacher">
    请输入课程学分：<input type="text" name="ccredit">
    <input type="submit" value="提交" >
</form>
</body>
</html>
