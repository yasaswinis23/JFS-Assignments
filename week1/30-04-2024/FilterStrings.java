import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterStrings {
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

        // Use Stream API to filter strings that start with "A" and print them
        List<String> filteredStrings = strings.stream()
                                               .filter(s -> s.startsWith("A"))
                                               .collect(Collectors.toList());

        // Print the filtered strings
        System.out.println("Strings starting with 'A':");
        filteredStrings.forEach(System.out::println);

        scanner.close();
    }
}

