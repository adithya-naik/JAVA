import java.util.Scanner;

public class _033_GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = s.nextInt();
        System.out.println("The GCD of "+ n1 + " and "+ n2 + " is = "+gcd(n1,n2));
        s.close();
    }
    public static int gcd(int n1,int n2){
        int gcd = 1;
        int least = least(n1,n2);
        int i=1;
        while(i<least){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int n1,int n2){
        if(n1>n2){
            return n2;
        }
        else{
            return n1 ;
        }
    }
}
