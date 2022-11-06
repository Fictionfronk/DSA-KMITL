import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class ComputeRPN {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static void main(String[] args) {
        //MyStackA stackA = new MyStackA();
        MyStackL stackL = new MyStackL();
        Scanner sc = new Scanner(System.in);
        String rpn = sc.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isNumeric(token)) {
                //stackA.push(Double.parseDouble(token));
                stackL.push(Double.parseDouble(token));
            } else {
                if (token.equals("+")) {
                    /*double b = stackA.pop();
                    double a = stackA.pop();
                    stackA.push(a + b);*/
                    double b = stackL.pop();
                    double a = stackL.pop();
                    stackL.push(a + b);
                } else if (token.equals("-")) {
                    /*double b = stackA.pop();
                    double a = stackA.pop();
                    stackA.push(a - b);*/
                    double b = stackL.pop();
                    double a = stackL.pop();
                    stackL.push(a - b);
                } else if (token.equals("*")) {
                    /*double b = stackA.pop();
                    double a = stackA.pop();
                    stackA.push(a * b);*/
                    double b = stackL.pop();
                    double a = stackL.pop();
                    stackL.push(a * b);
                } else if (token.equals("/")) {
                    /*double b = stackA.pop();
                    double a = stackA.pop();
                    stackA.push(a / b);*/
                    double b = stackL.pop();
                    double a = stackL.pop();
                    stackL.push(a / b);
                }
            }
        }
        //System.out.println("result: " + stackA.pop());
        System.out.println("result: " + stackL.pop());
    }
}
