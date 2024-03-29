import java.util.Scanner;
import java.lang.Math;

public class _053_MinOf2Nums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        float num1 = s.nextFloat();
        System.out.print("Enter the number 2 : ");
        float num2 = s.nextFloat();
        float min = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number is : " + min);
        s.close();
        // using Math class
        System.out.println("By using MATH class --> " + Math.min(num1, num2));
    }
}