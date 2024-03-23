import java.util.Scanner;
public class _009_ProductOfTwoNumbers {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first numb1er : ");
    float num1 = s.nextFloat();
    System.out.print("Enter the second number : ");
    float num2 = s.nextFloat();
    System.out.println("The Product of "+num1 + " and "+ num2+" = "+(num1*num2));
    s.close();
}
}
