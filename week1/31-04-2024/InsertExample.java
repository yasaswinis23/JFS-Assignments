import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {
    public static void main(String[] args) {
        String url = " mongodb://127.0.0.1:27017";
        String username = "Bhagyasri";
        String password = "12345#aA";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the query
            String sql = "INSERT INTO your_table_name (column1, column2, column3) VALUES ('value1', 'value2', 'value3')";
            int rowsAffected = statement.executeUpdate(sql);

            // Handle the result
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

            // Close the connection
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
