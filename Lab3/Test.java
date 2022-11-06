import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] digits = {9,9};
        String s = "";
        for(int i=0; i<digits.length; i++){
            s += digits[i];
        }
        int a = Integer.parseInt(s) + 1;
        s = Integer.toString(a);
        System.out.println(s);
    }
}
