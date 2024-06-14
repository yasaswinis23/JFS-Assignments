import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProductPrice {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/system";
        String username = "system";
        String password = "Bhagi";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the product ID: ");
            int productId = scanner.nextInt();

            System.out.print("Enter the new price: ");
            double newPrice = scanner.nextDouble();

            String sql = "UPDATE products SET price = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, newPrice);
            statement.setInt(2, productId);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Price updated successfully!");
            } else {
                System.out.println("Failed to update price. Please check the product ID.");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
