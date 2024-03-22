import java.util.Scanner;
// reverse right half pyramid
public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        s.close();
    }
}
