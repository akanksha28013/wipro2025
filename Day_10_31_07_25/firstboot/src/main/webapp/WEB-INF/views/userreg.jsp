<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form:form method="post" modelAttribute="user" action="/registerUser">
        Username: <form:input path="username"/><br/>
        Email: <form:input path="userEmail"/><br/>
        Phone: <form:input path="userPhone"/><br/>
        <input type="submit" value="Submit"/>
    </form:form>
    
</body>
</html>
