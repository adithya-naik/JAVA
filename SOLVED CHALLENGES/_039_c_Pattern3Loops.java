import java.util.Scanner;

//left half pyramid
public class _039_c_Pattern3Loops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = s.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();

    }
}
