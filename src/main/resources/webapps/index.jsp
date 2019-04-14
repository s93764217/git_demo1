<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EMPS</title>
</head>
<body>

<c:forEach items="${requestScope.emps}" var="emp">
    ${emp.id},${emp.name},${emp.age}
</c:forEach>
</body>
</html>
