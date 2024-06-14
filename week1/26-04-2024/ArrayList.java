import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Object> arrayList = new ArrayList<>();

        // Add elements of different data types
        arrayList.add(10);           // Integer
        arrayList.add("Hello");      // String
        arrayList.add(3.14);         // Double

        // Print the elements of the ArrayList
        for (Object element : arrayList) {
            System.out.println(element);
        }
    }
}
