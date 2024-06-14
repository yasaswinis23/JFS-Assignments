import java.util.Arrays;

public class LambdaSortDemo {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "kiwi", "mango"};

        // Sort the array of strings in descending order using lambda expression
        Arrays.sort(fruits, (String s1, String s2) -> s2.compareTo(s1));

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
