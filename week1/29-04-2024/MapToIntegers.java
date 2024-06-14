import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapToIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store integers
        List<Integer> numbers = new ArrayList<>();

        // Read integers from the user
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Use Stream API to map integers to their squares and print the results
        List<Integer> squares = numbers.stream()
                                        .map(x -> x * x)
                                        .collect(Collectors.toList());

        // Print the squared integers
        System.out.println("Squared integers:");
        squares.forEach(System.out::println);

        scanner.close();
    }
}
