import java.util.Scanner;

public class _044_DelElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the element to be deleted : ");
        int key = s.nextInt();
        int index = getIndex(key, arr);
        if (index != 10) {
            System.out.println("Index of the element to de deleted is : " + index);
            for (int i = index; i < size - 1; i++) {
                arr[index] = arr[index + 1];
            }
            System.out.println("Elements after Deleting " + key + " from the array : ");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(arr[i] + "   ");
            }
        } else {
            System.out.println(key + " Doesn't Exists  in the Array ");
        }
        s.close();
    }

    public static int getIndex(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return 10;
    }
}
