import java.util.Scanner;

public class _15_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n = s.nextInt();
        if(n>0){
            System.out.println("Number is Positive");

        }
        else if(n<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is equals Zero");
        }
        s.close();
    }
    
}
