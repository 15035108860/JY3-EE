<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22 0022
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="css/indexCss.css">
  </head>
  <body>
  <form action="/delete.do" method="post">
    <table>
      <thead>
      <th>用户ID</th>
      <th>用户名</th>
      <th>密码</th>
      </thead>
      <c:forEach items="${users}" var="user">
        <tr class="trId">
          <td><input type="text" name="userss" placeholder="${user.id}"></td>
          <td>${user.username}</td>
          <td>${user.password}</td>
          <td><button type="button"><a href="alter.jsp">修改</a></button></td>
          <td><button type="submit">删除</button></td>
        </tr>
      </c:forEach>
    </table>

  </form>

  </body>
</html>
