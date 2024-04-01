import java.util.Scanner;
import java.lang.Math;

public class _072_AreaCircumOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        double r = s.nextFloat();
        double Area = area(r);
        double Circumference = circum(r);
        System.out.printf("The Area of Circle is : " + Area + " \n The Circumference of the Circle is :" + Circumference);
        s.close();
    }

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double circum(double radius) {
        return 2 * Math.PI * radius;
    }
}
