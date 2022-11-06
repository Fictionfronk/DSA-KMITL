import java.io.IOException;
import java.util.Scanner;

public class StackTester {
    public static void main(String[] args) throws IOException {
        //Reverse String
        /*InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
        while (true) {
            System.out.print("Enter a word [or Enter to terminate]: ");
            String input = console.readLine();
            if (input.equals("")) {
                break;
            }
            int nChars = input.length();
            MyStack myStack = new MyStack(nChars);
            for (int i = 0; i < nChars; i++) {
                myStack.push(input.charAt(i));
            }
            String output = "";
            while (!myStack.isEmpty()) {
                char c = (Character) myStack.pop();
                output = output + c;
            }
            System.out.println("The reversed word: " + output);
        }*/
        MyStack myStack = new MyStack(5);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            myStack.push(scanner.nextInt());
        }
        System.out.println(myStack);

    }
}
