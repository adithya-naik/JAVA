import java.util.Scanner;

public class _036_FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Positive Number upto which fibonacci Series to be printed : ");
        int n = s.nextInt();
        int c = 0, a = 0, b = 1;
        System.out.println("Series Goes .........");
        System.out.print(a+" ");
        System.out.print(b+" ");

        while ((a+b) <= n) {
            c = a + b;
            System.out.print(c+ "  ");
            a = b;
            b = c;
        }

        s.close();
    }
}
