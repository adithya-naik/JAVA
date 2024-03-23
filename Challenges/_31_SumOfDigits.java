import java.util.Scanner;

public class _31_SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        int res = sumDigits(n);
        System.out.println("The Sum of the digits of "+ n + " is  = "+ res);
    }
    
    public static int sumDigits(int number){
        int sum=0,rem=0;
        while(number>0){
         rem = number%10;
            sum = sum+rem;
         number= number/10;
        }
       
        return sum;
    }
}
