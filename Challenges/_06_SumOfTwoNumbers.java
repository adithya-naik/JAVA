import java.util.Scanner;

public class _06_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = s.nextDouble();
        System.out.print("Enter Second number : ");
        double num2 = s.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum : " + sum);
        s.close();
    }
}