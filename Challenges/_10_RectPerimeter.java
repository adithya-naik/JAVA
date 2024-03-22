import java.util.Scanner;
public class _10_RectPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        float l = s.nextFloat();
        System.out.print("Enter breadth of the rectangle : ");
        float b = s.nextFloat();
        System.out.println("The Perimeter of the rectangle is : "+(2*(l+b)));
        s.close();
    }
}
