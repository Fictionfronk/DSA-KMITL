import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class ComputeInfix {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static int getPrecedence(String s) {
        if (s.equals("+") || s.equals("-")) {
            return 1;
        } else if (s.equals("*") || s.equals("/")) {
            return 2;
        } else if (s.equals("(")) {
            return 3;
        } else
            return -1;
    }

    public static void main(String[] args) {
        MyQueueA queueA = new MyQueueA();
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String rpn = sc.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isNumeric(token)) {
                queueA.enqueue(token);
            } else {
                if (stack.isEmpty()) {
                    stack.push(token);
                } else {
                    if (getPrecedence(token) == 3) {
                        stack.push(token);
                    } else if (stack.lastElement().equals("(")) {
                        stack.push(token);
                    } else if (getPrecedence(token) == -1) {
                        while (!stack.lastElement().equals("(")) {
                            queueA.enqueue(stack.pop());
                        }
                        stack.pop();
                    } else if (getPrecedence(token) < getPrecedence(stack.lastElement()) || getPrecedence(token) == getPrecedence(stack.lastElement())) {
                        queueA.enqueue(stack.pop());
                        stack.push(token);
                    } else {
                        stack.push(token);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            queueA.enqueue(stack.pop());
        }
        System.out.println("Queue: " + queueA);
        //System.out.println("Stack: " + stack);
        System.out.println("result: " + ComputeRPN(queueA));
    }

    public static int ComputeRPN(MyQueueA q) {
        Stack<Integer> output = new Stack<>();
        while (!q.isEmpty()) {
            if (isNumeric(q.front())) {
                output.push(Integer.parseInt(q.dequeue()));
            } else {
                if (q.front().equals("+")) {
                    int b = output.pop();
                    int a = output.pop();
                    output.push(a + b);
                    q.dequeue();
                } else if (q.front().equals("-")) {
                    int b = output.pop();
                    int a = output.pop();
                    output.push(a - b);
                    q.dequeue();
                } else if (q.front().equals("*")) {
                    int b = output.pop();
                    int a = output.pop();
                    output.push(a * b);
                    q.dequeue();
                } else if (q.front().equals("/")) {
                    int b = output.pop();
                    int a = output.pop();
                    output.push(a / b);
                    q.dequeue();
                }
            }
        }
        return output.pop();
    }

}
