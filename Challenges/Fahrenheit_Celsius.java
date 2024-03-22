import java.util.Scanner;
public class Fahrenheit_Celsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Temperature in (F) : ");
        float f = s.nextFloat();
        float c = ((f-32)*(5/9.0f));
        System.out.println("Temperature in (C) : "+c);
        s.close();
    }
}
