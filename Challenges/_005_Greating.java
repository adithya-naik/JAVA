import java.util.Scanner;

public class _005_Greating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.println("Welcome "+name + " to KG Coding");
        s.close();
    }
}
