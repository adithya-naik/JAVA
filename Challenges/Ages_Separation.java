import java.util.Scanner;

public interface Ages_Separation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        if(age<13){
            System.out.println("Child");
        }
        else if(age>=13 && age<20){
            System.out.println("Teen");
        }
        else if(age<60 && age>=20){
            System.out.println("'Adult");
        }
        else{
            System.out.println("Senior");
        }
        s.close();
    }
}
