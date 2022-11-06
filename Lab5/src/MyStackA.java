public class MyStackA {
    private int MAXSIZE = 100;
    private double stack[];
    private int top = 0;

    public MyStackA() {
        this.stack = new double[MAXSIZE];
    }

    public void push(double d) {
        stack[top++] = d;
    }

    public double pop() {
        return stack[--top];
    }

    public double getTop() {
        return stack[top - 1];
    }

    public boolean isFull() {
        return top == MAXSIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }


    public String toString() {
        StringBuffer sb = new StringBuffer("top");
        for (int i = 1; i<=top; i++) {
            sb.append(" --> ");
            sb.append(stack[top-i]);
        }
        return new String((sb));
    }
}
