import java.util.Scanner;

public class Grades_Separation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Percentage : ");
        float per = s.nextFloat();

        if(per>90.0){
            System.out.println("A Grade");
        }
        else if (per>=75.0){
            System.out.println("B Grade");
        }
        else if (per>=60.0 && per<75.0){
            System.out.println("C Grade");
        }
        else if (per>=30.0 && per<60.0){
            System.out.println("D Grade");
        }
        else{
            System.out.println("E Grade");
        }
        s.close();
    }
}
