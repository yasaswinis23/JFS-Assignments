import java.util.Scanner;
public class AreaOfRectangle {
   public static void main(String args[]){
      int length, breadth, area;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle :");
      length = scanner.nextInt();
      System.out.println("Enter the breadth of the rectangle :");
      breadth = scanner.nextInt();
      area = length* breadth;
      System.out.println("---------------------------");
      System.out.println("Area of the rectangle is ::"+area);
      scanner.close();
   }
}