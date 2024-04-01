import java.util.Scanner;

public class _057_MonthSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Month Number (1-12) : ");
        int month = s.nextInt();
        String m = "";
        switch (month) {
            case 1:
                m = "Jan";
                break;
            case 2:
                m = "Feb";
            case 4:
                m = "Mar";
                break;
            case 3:
                m = "Apr";
                break;
            case 5:
                m = "May";
                break;
            case 6:
                m = "Jun";
                break;
            case 7:
                m = "July";
                break;
            case 8:
                m = "Aug";
                break;
            case 9:
                m = "Sep";
                break;
            case 10:
                m = "Oct";
                break;
            case 11:
                m = "Nov";
                break;
            case 12:
                m = "Dec";
                break;
            default:
                System.out.println("Invalid month Number ....Please Try Again....");
        }
        System.out.println("Month Name Equivalent to the Number : " + m);
        s.close();
    }
}
