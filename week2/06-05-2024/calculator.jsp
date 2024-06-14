<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form method="post">
        <label for="number1">Number 1:</label>
        <input type="text" id="number1" name="number1" required><br><br>
        <label for="number2">Number 2:</label>
        <input type="text" id="number2" name="number2" required><br><br>
        <label for="operation">Operation:</label>
        <select id="operation" name="operation">
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>

    <%
        // Retrieve input from the request
        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");
        String operation = request.getParameter("operation");
        double result = 0;
        boolean validInput = true;

        if (num1 != null && num2 != null && operation != null) {
            try {
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);

                // Perform the selected operation
                switch (operation) {
                    case "add":
                        result = number1 + number2;
                        break;
                    case "subtract":
                        result = number1 - number2;
                        break;
                    case "multiply":
                        result = number1 * number2;
                        break;
                    case "divide":
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            out.println("<p style='color:red;'>Error: Division by zero is not allowed.</p>");
                            validInput = false;
                        }
                        break;
                    default:
                        out.println("<p style='color:red;'>Error: Invalid operation selected.</p>");
                        validInput = false;
                }

                // Display the result if the input was valid
                if (validInput) {
                    out.println("<h3>Result: " + result + "</h3>");
                }

            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Error: Invalid input. Please enter numeric values.</p>");
            }
        }
    %>
</body>
</html>
