<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <h2>Registration Confirmation</h2>
    
    <p>First Name: <%= request.getParameter("firstName") %></p>
    <p>Last Name: <%= request.getParameter("lastName") %></p>
    <p>Date of Birth: <%= request.getParameter("dob") %></p>
    <p>Email: <%= request.getParameter("email") %></p>
    
    <a href="register.jsp">Back to Register</a>
</body>
</html>
