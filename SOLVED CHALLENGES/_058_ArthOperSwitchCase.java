import java.util.Scanner;

public class _058_ArthOperSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = s.nextFloat();
        System.out.print("Enter Second number : ");
        float b = s.nextFloat();
        System.out.print("1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Division\nEnter Your Choice : ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition : " + (a + b));
                break;
            case 2:
                System.out.println("Substraction : " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication : " + (a * b));
                break;
            case 4:
                System.out.println("Division : " + (a / b));
                break;
            case 5:
                System.out.println("Modulus : " + (a % b));
                break;
            default:
                System.out.println("Please ....Enter Valid Choice");
        }
        s.close();

    }
}
