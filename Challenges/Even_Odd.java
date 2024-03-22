import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n = s.nextInt();          
        if(n%2==0){
            System.out.print("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
        s.close();
    }
}
