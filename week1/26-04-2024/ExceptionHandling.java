public class ExceptionHandling{
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempt to divide two numbers
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException if division by zero occurs
            System.out.println("Error: Division by zero");
        } finally {
            // Finally block always executes, regardless of whether an exception occurred
            System.out.println("Finally block executed");
        }
    }
}
