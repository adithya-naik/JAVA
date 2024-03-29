import java.util.Scanner;

// reverse right half pyramid
public class _039_b_Pattern2Loops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = s.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        s.close();
    }
}
