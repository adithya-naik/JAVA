import java.util.Scanner;

public class _30_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        System.out.println("Factorial of "+ n + " is  = "+fact(n));
        s.close();
    }

    public static int fact(int n ){
        int i = 1,f =1;
        while(i<(n+1)){
            f*=i;
            i++;
        }
        return f;
    }
    
}
