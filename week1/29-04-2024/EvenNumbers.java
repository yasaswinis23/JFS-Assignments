import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use lambda expression to filter even numbers
        List<Integer> evenNumbers = filter(numbers, (Integer number) -> number % 2 == 0);

        // Print the even numbers
        System.out.println("Even numbers:");
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
    }

    // Generic method to filter a list based on a condition
    public static <T> List<T> filter(List<T> list, Condition<T> condition) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    // Functional interface to represent a condition
    interface Condition<T> {
        boolean test(T t);
    }
}
