
public class Subclass extends Person {
    public void displayDetails() {
        // Accessing age and address from the superclass
        System.out.println("Age: " + age); // age is accessible because it's protected
        System.out.println("Address: " + address); // address is accessible because it's default
    }

    public static void main(String[] args) {
        // Creating an object of the subclass
        Subclass subclass = new Subclass();

        // Setting values using setter methods from superclass
        subclass.setName("John Doe");
        subclass.setAge(30);
        subclass.setAddress("123 Main Street");

        // Displaying details using displayDetails method
        subclass.displayDetails();
    }
}
