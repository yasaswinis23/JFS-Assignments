<!-- displayDateTime.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time using java.util.Date</h2>
    <%
        // Import the required classes
        import java.util.Date;
        
        // Get the current date and time
        Date currentDate = new Date();
    %>
    <p>Current Date and Time: <%= currentDate %></p>
</body>
</html>
