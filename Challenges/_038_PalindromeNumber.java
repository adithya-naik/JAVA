import java.util.Scanner;

public class _038_PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = s.nextInt();
        boolean result = isPalindrome(n);
        if (result == true) {
            System.out.println(n + " is a Palindrome Number");
        } else {
            System.out.println(n + " is a not Palindrome Number");
        }
        s.close();
    }

    public static boolean isPalindrome(int n) {
        int number = n;
        int newNum = 0, rem = 0;
        while (number > 0) {
            rem = number % 10;
            newNum = (newNum * 10) + rem;
            number = number / 10;
        }

        if (newNum == n) {
            return true;
        } else {
            return false;
        }
    }
}
