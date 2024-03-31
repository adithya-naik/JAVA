import java.util.Scanner;

public class _045_RevArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Elements of the Array BEFORE reversing  : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nElements of the Array AFTER reversing  : ");
        for (int i = size - 1; i > -1; i--) {
            System.out.print(arr[i] + "  ");
        }
        s.close();
    }
}
