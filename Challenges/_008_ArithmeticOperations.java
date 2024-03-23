import java.util.Scanner;

public class _008_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = s.nextFloat();
        System.out.print("Enter Second number : ");
        float b = s.nextFloat();
        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modulus : "+(a%b));
        s.close();

    }
}
