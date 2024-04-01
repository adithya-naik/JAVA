import java.util.Scanner;

public class _046_IsArraypalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        boolean res = isArrpal(arr);
        if (res) {
            System.out.println("Yes,It is a Palindrome Array");
        } else {
            System.out.println("No,It is NOT a Palindrome Array");
        }
        s.close();
    }

    public static boolean isArrpal(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
