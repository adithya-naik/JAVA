import java.util.Scanner;

public class _034_IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int n1 = s.nextInt();
        int c = 0;
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                c++;
            }
        }
        if (c != 0) {
            System.out.println(n1 + " is composite");
        } else {
            System.out.println(n1 + " is Prime");
        }
        s.close();
    }
}
