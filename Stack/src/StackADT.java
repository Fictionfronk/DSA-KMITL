public interface StackADT {
    public void push(Object o);

    public Object pop() throws StackEmptyException;

    public int size();

    public boolean isEmpty();

    public Object top() throws StackEmptyException;
}
