<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/employees/addList" method="post">
    id:<input type="text" name="list[0].id"><br>
    name:<input type="text" name="list[0].name"><br>
    address:<input type="text" name="list[0].address.homeAddress"><br>

    id2:<input type="text" name="list[1].id"><br>
    name2:<input type="text" name="list[1].name"><br>
    address2:<input type="text" name="list[1].address.homeAddress"><br>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
