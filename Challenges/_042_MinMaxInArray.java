import java.util.Scanner;

public class _042_MinMaxInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the Array : ");
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++)
            arr[i] = s.nextInt();
        }
        int  min=arr[0],max=arr[0];
        for(int k=0;k<arr.length;k++){
            if(arr[k]<arr[k+1]){
                min=arr[k];
            }
            if(arr[k]>arr[k+1]){
                max=arr[k];
            }
        }
        System.out.println("The Minimum Number is : "+min);
        System.out.println("The Maximum Number is : "+max);
        s.close();
    }
}
