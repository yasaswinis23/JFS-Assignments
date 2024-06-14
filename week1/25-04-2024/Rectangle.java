package com.example.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print the elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }

        // Get and print the element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Remove the element at index 1
        list.remove(1);

        // Print the updated elements of the ArrayList
        System.out.println("Updated elements of the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }

        // Check if the ArrayList contains "Banana"
        if (list.contains("Banana")) {
            System.out.println("The ArrayList contains 'Banana'");
        } else {
            System.out.println("The ArrayList does not contain 'Banana'");
        }

        // Print the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Clear the ArrayList
        list.clear();

        // Check if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }
    }
}
