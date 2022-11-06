import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s = "Hello";
        char c[] = new char[s.length()];
        System.out.println(s.charAt(0));
        for(int i=0;i<s.length();i++){
            c[i] = s.charAt(i);
        }
        System.out.println(c);
        System.out.println(s.length());
        int a[] = {8,7,6,5,4,3,2,1,0};
        //System.out.println(a[a[4]-a[2]]);
        int b[] = new int[a.length];
        int j = 0;
        for(int i=a.length-1;i>=0;i--){
            b[j] = a[i]*a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }
}
