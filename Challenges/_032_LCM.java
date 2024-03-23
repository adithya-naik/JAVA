import java.util.Scanner;

public class _032_LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = s.nextInt();
        System.out.println("The LCM of "+ n1 + " and "+ n2 + " is = "+lcm(n1,n2));
        s.close();
    }
    public static int lcm(int n1,int n2){
        for(int i=1;;i++){
            if((n1*i)%n2 == 0){
                int res= n1*i;
                return res;
            }
        }
    }
}
