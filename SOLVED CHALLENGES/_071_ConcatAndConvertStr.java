import java.util.Scanner;

public class _071_ConcatAndConvertStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String s1 = s.next();
        System.out.print("Enter the String 2 : ");
        String s2 = s.next();
        String ConcatinatedStr = s1.concat(s2);
        String res = ConcatinatedStr.toUpperCase();
        System.out.println("After Concat : " + res);
        s.close();
    }
}
