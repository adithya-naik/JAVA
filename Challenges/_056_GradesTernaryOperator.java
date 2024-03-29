import java.util.Scanner;

public class _056_GradesTernaryOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Score : ");
        int score = s.nextInt();
        String rank = score > 80 ? "High" : (score <= 80 && score >= 50) ? "Moderate" : "Low";
        System.out.println("Your Rank : " + rank);
        s.close();
    }
}
