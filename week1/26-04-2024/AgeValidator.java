import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();

        try {
            // Call the method to validate age
            validateAge(personAge);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Invalid Age: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
