import java.util.Scanner;

public class _041_OccurenceOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the Array : ");
        Float[] arr = new Float[size];
        for(int i=0; i< arr.length;i++){
            arr[i] = s.nextFloat();
        }
        System.out.print("Enter the number to be found for no.of repetations : ");
        float key = s.nextFloat();
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==key){
                count++;
            }
        }
        if(count!=0){
            System.out.println(key + " is found "+ count + " time(s) in the Array");
        }
        else{
            System.out.println(key + " is not found in the Array");
        }
        s.close();
    }
}
