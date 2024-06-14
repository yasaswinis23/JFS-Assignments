import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOrder {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/system";
        String username = "system";
        String password = "Bhagi";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the order ID to delete: ");
            int orderId = scanner.nextInt();

            String sql = "DELETE FROM orders WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, orderId);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Order deleted successfully!");
            } else {
                System.out.println("Failed to delete order. Please check the order ID.");
            }

        } catch (SQLException e) {
            System.ou
