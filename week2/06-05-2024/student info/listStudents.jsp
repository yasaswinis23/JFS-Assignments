<!-- listStudents.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>List of Students</title>
</head>
<body>
    <h2>List of Students</h2>
    <c:forEach var="student" items="${students}">
        <p>Name: ${student.name}, Age: ${student.age}, Grade: ${student.grade}</p>
    </c:forEach>
    <a href="inputStudent.jsp">Add New Student</a>
</body>
</html>
