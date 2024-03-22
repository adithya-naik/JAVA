import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = s.nextInt();
        if((year%400 == 0)||(((year%4) == 0)  && ((year%100)!=0))){
                System.out.println(year + " is a Leep year");
        }
        else{
           System.out.println(year + " is not a Leap year");
        }
        s.close();
    }
}
