import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("---------------------------");
        System.out.println("\nBefore swapping: \n num1 = " + num1 + ", num2 = " + num2);
        // Swap the values without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.print("---------------------------- ");
        System.out.println("\nAfter swapping: \n num1 = " + num1 + ", num2 = " + num2);
        scanner.close();
    }
}
