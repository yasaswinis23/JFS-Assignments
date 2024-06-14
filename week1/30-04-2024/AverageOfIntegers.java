import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store integers
        List<Integer> numbers = new ArrayList<>();

        // Read integers from the user
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Calculate the average using the Stream API
        double average = numbers.stream()
                                .mapToDouble(Integer::doubleValue)
                                .average()
                                .orElse(Double.NaN);

        // Print the average
        if (!Double.isNaN(average)) {
            System.out.println("Average: " + average);
        } else {
            System.out.println("No integers entered.");
        }

        scanner.close();
    }
}
