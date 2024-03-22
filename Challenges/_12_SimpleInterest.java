import java.util.Scanner;

public class _12_SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        float p = s.nextFloat();
        System.out.print("Enter the Time period in years : ");
        float t = s.nextFloat();
        System.out.print("Enter the Rate Percentage : ");
        float r = s.nextFloat();
        System.out.println("The Simple Interest  = Rs."+(p*t*r)/(100.0f));
        s.close();
    }
}
