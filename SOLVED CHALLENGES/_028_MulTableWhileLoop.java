import java.util.Scanner;

public class _028_MulTableWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
        int i = 1;
        while (i < 11) {
            System.out.println(number + " * " + i + " = " + number * i);
            i++;
        }
        s.close();
    }
}
