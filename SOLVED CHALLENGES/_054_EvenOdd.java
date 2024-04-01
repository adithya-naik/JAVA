import java.util.Scanner;

public class _054_EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float num = s.nextFloat();
        // completly using ternary operator
        boolean res = num % 2 == 0 ? true : false;
        // even for this
        System.out.println();
        System.out.println(res == true ? "Even Number\n" : "Odd Number\n");
        s.close();
    }
}
