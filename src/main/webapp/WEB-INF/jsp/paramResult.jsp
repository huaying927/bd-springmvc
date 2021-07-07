<%--
  Created by IntelliJ IDEA.
  User: sunfei
  Date: 2021/7/7
  Time: 08:42
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ParamResult</title>
</head>
<body>
<h2>get(HttpServletRequest request)方法: ${my_id}</h2>
<h2>get2(int id, HttpServletRequest request)方法: ${my_id2}</h2>
<h2>get3(int id, String name, HttpServletRequest request)方法: ${my_id3}==>${my_name3}</h2>
<h2>get4(int id, String name, HttpServletRequest request)方法: ${my_id4}==>${my_name4}</h2>
<h2>get5(@RequestParam(name = "ids", required = false) int id, @RequestParam(value = "uname", required = false) String name, HttpServletRequest request)方法: ${my_id5}==>${my_name5}</h2>
<h2>get6(User user, HttpServletRequest request)方法: ${user.id}==>${user.name}</h2>
<h2>get7(User user, Map<\String,User> map)方法: ${user}</h2>
<h2>get8(User user, Map<\String,User> map)方法: ${u}</h2>
<h2>get9(User user, Model model)方法: ${user}</h2>
<h2>get10(User user, Model model)方法: ${my_user}</h2>
<h2>
    get11(Model model)方法: ${userList}<br/>
    <c:forEach items="${userList}" var="myUser" varStatus="vs">
        ${vs.count}-------->${myUser}<br/>
    </c:forEach>
</h2>
<h2>get12(Model model)方法: ${hashMap}</h2>
<h2>
    get13(Model model)方法: ${userMap}<br/>
    <c:forEach items="${userMap}" var="myEntry">
<%--        ${myEntry}<br/>--%>
        ${myEntry.key}==>[${myEntry.value.id} <==>${myEntry.value.name}]<br/>
    </c:forEach>
</h2>
<h2>get14(@ModelAttribute("mapUser") Map<\String,User> map)方法: ${mapUser}</h2>
<h2>get15(@PathVariable(name="ids",required = false) int id, @PathVariable(required = false) String name, Model model)方法: ${user}</h2>
</body>
</html>
