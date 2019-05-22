<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22 0022
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/alter.do" method="post">
        用户ID：<input type="text" name="userId"><br><br>
        请输入用户名：<input type="text" name="username"><br><br>
        请输入旧密码：<input type="text" name="oldPsw"><br><br>
        请输入新密码：<input type="text" name="newPsw"><br><br>
        <button type="submit">修改</button>
    </form>
</body>
</html>
