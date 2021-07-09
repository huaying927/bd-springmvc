<%--
  Created by IntelliJ IDEA.
  User: sunfei
  Date: 2019/4/19
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
添加成功！<br/>
${employeeListForm}<br/>
<c:forEach items="${employeeListForm.list}" var="employee">
    ${employee.id}=>${employee.name}=>${employee.address.homeAddress}<br/>
</c:forEach>
</body>
</html>
