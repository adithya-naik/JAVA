import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = s.nextInt();
        System.out.print("Enter Second number : ");
        int b = s.nextInt();
        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modulus : "+(a%b));


    }
}
