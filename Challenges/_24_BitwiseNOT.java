import java.util.Scanner;

public class _24_BitwiseNOT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = s.nextInt();
        int result = ~first;
        System.out.println("Bitwise NOT result : "+result);
        s.close();
    }
    
}

