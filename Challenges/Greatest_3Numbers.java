import java.util.Scanner;
public class Greatest_3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = s.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = s.nextInt();
        System.out.print("Enter 3rd number : ");
        int num3 = s.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("Greatest amonst "+num1 +","+ num2 + ","+ num3 + " is "+num1);
        }
        else if(num2>=num3){
            System.out.println("Greatest amonst "+num1 +","+ num2 + ","+ num3 +" is "+num2);
        }
        else{
            System.out.println("Greatest amonst "+num1 +","+ num2 + ","+ num3 +" is "+num3); 
        }
        s.close();
    }
}
