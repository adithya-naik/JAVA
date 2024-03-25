import java.util.Scanner;

public class _040_SumAverageOfArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the Array : ");
        Float[] arr = new Float[size];
        float sum = 0f ;
        for(int i=0; i< arr.length;i++){
            arr[i] = s.nextFloat();
            sum+=arr[i];
        }
        System.out.println("The sum of the elements of the array : "+sum);
        System.out.println("the Average of the Array elements : "+(sum/arr.length));
        s.close();
    }
}