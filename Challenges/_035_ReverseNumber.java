import java.util.Scanner;
public class _035_ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int n1 = s.nextInt();
        System.out.println("The Reverse of "+n1 + " is "+ rev(n1));
        s.close();
    }
    
    public static int rev(int number) {
        int sum=0,rem=0;
        while(number>0){
            rem = number%10;
            sum = sum*10+rem;
            number= number/10;
        }
        return sum;
    }
}