public class MyStack implements StackADT {
    private Object[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        stackArray = new Object[maxSize];
        top = -1;
    }

    public MyStack() {
        this(100);
    }

    public void push(Object o) {
        if (size() == stackArray.length)
            throw new StackFullException("Stack is Full.");
        stackArray[++top] = o;
    }

    public Object pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty.");
        return stackArray[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty.");
        return stackArray[top];
    }

    public String toString() throws StackEmptyException {
        StringBuilder sb = new StringBuilder("top");
        for (int i = 0; i < top+1; i++) {
            sb.append(" --> ");
            sb.append(stackArray[top-i]);
        }
        return new String((sb));
    }
}
