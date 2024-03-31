import java.util.Scanner;

public class _043_IsArraySorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        boolean isInc = isIncr(arr);
        boolean isDec = isDecr(arr);
        if (isDec || isInc) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
        s.close();
    }

    public static boolean isIncr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }

}