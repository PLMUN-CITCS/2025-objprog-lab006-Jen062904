import java.util.Scanner;

public class CircleCalculator {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the radius of the Circle: ");
   double radius = scanner.nextDouble();

   double area = Math.PI * Math.pow(radius, 2);
   double circumference = 2 * Math.PI * radius;

   System.out.println("Area: " + area);
   System.out.println("Circumference: " + circumference);

   scanner.close();


  }

}
