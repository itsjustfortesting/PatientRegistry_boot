<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<table align="center" border="0">
    <form:form action="${pageContext.request.contextPath}/loginauth" method="post" >
        <tr>
            <td colspan="2" align="center"><h2>Login</h2></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <c:if test="${param.error != null}">
            <tr>
                <td colspan="2" align="center"><i style="color: red">Wrong username or password</i></td>
            </tr>
        </c:if>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Login"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><hr><a href="${pageContext.request.contextPath}/newuserform">Create new user</a></td>
        </tr>
    </form:form>
</table>
</body>
</html>
