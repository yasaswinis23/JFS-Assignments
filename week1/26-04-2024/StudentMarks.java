import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a HashMap to store student names and marks
        Map<String, Integer> studentMarks = new HashMap<>();

        // Add student names and marks to the HashMap
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);
        studentMarks.put("Eve", 88);

        // Print the names and marks of all students
        System.out.println("Student Names and Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            int marks = entry.getValue();
            System.out.println(name + ": " + marks);
        }
    }
}
