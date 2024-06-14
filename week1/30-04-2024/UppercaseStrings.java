import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "mango");

        // Create a stream of strings, convert each string to uppercase, and collect the results into a new list
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        // Print the list of uppercase strings
        System.out.println("Uppercase strings:");
        System.out.println(uppercaseStrings);
    }
}
