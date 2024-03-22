import java.util.Scanner;

public class _22_BitwiseOR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = s.nextInt();
        System.out.print("Enter second number : ");
        int second = s.nextInt();
        int result = first | second;
        System.out.println("Bitwise OR result : "+result);
        s.close();
    }
    
}
