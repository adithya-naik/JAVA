import java.util.Scanner;

public class _050_SumOfPrincipalDiagEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows in Array : ");
        int r = s.nextInt();
        System.out.print("Enter the number of Coloumns in Array : ");
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements : ");
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The Elements of the Array are : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Sum of Diagonal Elements : " + sum);
        s.close();
    }
}
