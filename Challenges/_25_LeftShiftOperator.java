import java.util.Scanner;

public class _25_LeftShiftOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = s.nextInt();
        int result = first<<2;
        System.out.println("Left Shift Operator ----> result : "+result);
        s.close();
    }
    
}

