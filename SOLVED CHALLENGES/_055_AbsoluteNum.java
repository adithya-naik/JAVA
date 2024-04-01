import java.util.Scanner;
import java.lang.Math;

public class _055_AbsoluteNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num = s.nextDouble();
        System.out.println("The Absolute Value of " + num + " is : " + Math.abs(num));
        s.close();
    }
}
