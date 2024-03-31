import java.util.Scanner;

public class _048_SearchIn2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in Array : ");
        int r = s.nextInt();
        System.out.print("Enter the number of Coloumns in Array : ");
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("The Elements of the Array are : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int flag = 0;
        System.out.println("Enter the element to be searched : ");
        int key = s.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == key) {
                    flag = 9;
                    break;
                }
            }
        }
        if (flag == 9) {
            System.out.println(key + " is Found");
        } else {
            System.out.println(key + " is not found");
        }
        s.close();
    }
}
