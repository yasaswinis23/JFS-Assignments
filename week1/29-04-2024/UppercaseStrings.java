import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UppercaseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store strings
        List<String> strings = new ArrayList<>();

        // Read strings from the user
        System.out.println("Enter strings (enter 'stop' to stop):");
        String input;
        while (!(input = scanner.nextLine()).equals("stop")) {
            strings.add(input);
        }

        System.out.println("Strings in uppercase:");
        strings.forEach(s -> System.out.println(s.toUpperCase()));

        scanner.close();
    }
}
