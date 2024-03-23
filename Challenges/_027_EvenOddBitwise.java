import java.util.Scanner;
public class _027_EvenOddBitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = s.nextInt();
        if((first & 1) == 1){
            System.out.println(first + " is a Odd Number ");
        }
        else{
            System.out.println(first + " is a Even Number ");
        }
        s.close();
    } 
}

