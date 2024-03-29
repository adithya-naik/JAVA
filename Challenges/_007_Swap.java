import java.util.Scanner;

public class _007_Swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value 1 : ");
        int val1 = s.nextInt();
        System.out.print("Enter value 2 : ");
        int val2 = s.nextInt();
        System.out.println("Before swapping");
        System.out.println("value 1 = " + val1 + "\nvalue 2 = " + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("After swapping");
        System.out.println("value 1 = " + val1 + "\nvalue 2 = " + val2);
        s.close();
    }
}
