import java.util.Scanner;

public class _037_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        boolean result = isArmstrong(n);
        if (result == true) {
            System.out.println(n + " is a Armstrong Number");
        } else {
            System.out.println(n + " is  not a Armstrong Number");
        }
        s.close();
    }

    public static boolean isArmstrong(int number) {
        double rem = 0, sum = 0;
        int n = number;
        while (n > 0) {
            rem = n % 10;
            sum = sum + Math.pow(rem, 3);
            n = n / 10;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

}
