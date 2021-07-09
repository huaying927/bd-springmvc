<%--
  Created by IntelliJ IDEA.
  User: sunfei
  Date: 2021/6/22
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/user/add" method="post">
    <table>
        <tr>
            <td>ID：</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td>
                <input type="name" name="name">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</body>
</html>
