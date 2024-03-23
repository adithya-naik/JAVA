import java.util.Scanner;

public class _004_SingleLinePatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\nright half pyramid,reverse right half pyramid,left half pyramid\n");
        System.out.print("Enter the number of rows :");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("Enter the number of rows :");
        int n1 = s.nextInt();
        for(int i=n1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("            *");
        System.out.println("         *  *");
        System.out.println("      *  *  *");
        System.out.println("   *  *  *  *");
        System.out.println("*  *  *  *  *");
        s.close();
    }
}
