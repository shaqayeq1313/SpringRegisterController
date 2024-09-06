<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register Form</h2>
    
    <form action="register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" id="firstName" value="${param.firstName}">
        <span style="color: red;">${errorFirstName}</span>
        <br>
        
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" id="lastName" value="${param.lastName}">
        <span style="color: red;">${errorLastName}</span>
        <br>
        
        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" id="dob" value="${param.dob}">
        <span style="color: red;">${errorDob}</span>
        <br>
        
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="${param.email}">
        <span style="color: red;">${errorEmail}</span>
        <br><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>
