public interface TreeItem {
    public String toString();

    public Object getKey();

    public int compareTo(Object otherKey);
}
