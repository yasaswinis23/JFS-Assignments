<<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Visit Counter</title>
</head>
<body>
    <h1>Visit Counter</h1>
    <p>This page has been visited <%= request.getAttribute("visitCount") %> times.</p>
</body>
</html>

