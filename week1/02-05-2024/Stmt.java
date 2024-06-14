import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementVsPreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/system";
        String username = "system";
        String password = "Bhagi";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            // Using Statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table_name WHERE id = 1");
            while (resultSet.next()) {
                System.out.println("Statement Result: " + resultSet.getString("name"));
            }
            statement.close();

            // Using PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM your_table_name WHERE id = ?");
            preparedStatement.setInt(1, 1);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("PreparedStatement Result: " + resultSet.getString("name"));
            }
            preparedStatement.close();

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
