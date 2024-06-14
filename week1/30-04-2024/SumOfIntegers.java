33 import java.util.Arrays;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store integers
        int[] numbers = new int[n];

        // Read integers from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Create a stream of integers from the array and calculate the sum using the Stream API
        int sum = Arrays.stream(numbers)
                        .sum();

        // Print the sum
        System.out.println("Sum of all elements: " + sum);

        scanner.close();
    }
}
