<%--
  Created by IntelliJ IDEA.
  User: sunfei
  Date: 2019/4/19
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/employees/add" method="post">
    id:<input type="text" name="id"><br>
    name:<input type="text" name="name"><br>
    address:<input type="text" name="address.homeAddress"><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
