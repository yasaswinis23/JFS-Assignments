import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: \n");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("=================");
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = calculateAverage(arr);
        System.out.println("==================");
        System.out.println("Average of the elements in the array: " + average);
        scanner.close();
    }

    // Method 
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
