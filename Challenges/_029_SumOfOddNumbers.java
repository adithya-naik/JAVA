import java.util.Scanner;
public class _029_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the odd number upto which you want to Add : ");
        int num = s.nextInt();
        int i = 1;
        int sum=0;
        while(i<num+1){
            sum += i;
            i = i+2;
        }
        System.out.println("Sum of Odd Numbers upto "+num + " is  = "+sum);
        s.close();
    }
}