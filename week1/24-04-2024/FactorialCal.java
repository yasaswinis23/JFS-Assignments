import java.util.Scanner;

public class FactorialCal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        long factorial = cFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
    public static long cFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * cFactorial(n - 1);
        }
    }
}
