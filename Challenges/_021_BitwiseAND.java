import java.util.Scanner;

public class _021_BitwiseAND {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = s.nextInt();
        System.out.print("Enter second number : ");
        int second = s.nextInt();
        int result = first & second;
        System.out.println("Bitwise AND result : "+result);
        s.close();
    }
    
}
