import java.util.Scanner;

public class _011_TriangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base of the Triangle : ");
        float b = s.nextFloat();
        System.out.print("Enter height of the Triangle : ");
        float h = s.nextFloat();
        System.out.println("The Area of the Triangle is : "+((0.5)*(b*h)));
        s.close();
        
    }
}
