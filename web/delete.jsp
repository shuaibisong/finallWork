<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body>
   <form action="DeleteServlet" method="post">
       请输入想要删除的账号：<input type="text" name="id">
       <input type="submit" value="提交" >
   </form>
</body>

</html>
