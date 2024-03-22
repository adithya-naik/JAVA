import java.util.Scanner;
//right half pyramid
public class _03_a_Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        s.close();
    }
}
