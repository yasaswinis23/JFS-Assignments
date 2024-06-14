import java.util.Scanner;
import java.util.Arrays;
3

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of squares using lambda expression
        int sumOfSquares = Arrays.stream(numbers)
                                 .map(x -> x * x)
                                 .sum();

        // Print the sum of squares
        System.out.println("Sum of squares: " + sumOfSquares);

        scanner.close();
    }
}
