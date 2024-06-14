import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store integers
        List<Integer> numbers = new ArrayList<>();

        // Read integers from the user
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Find the maximum element using the Stream API
        Integer maxElement = numbers.stream()
                                    .max(Integer::compare)
                                    .orElse(null);

        // Print the maximum element
        if (maxElement != null) {
            System.out.println("Maximum element: " + maxElement);
        } else {
            System.out.println("No elements entered.");
        }

        scanner.close();
    }
}
