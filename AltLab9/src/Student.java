public class Student implements TreeItem {
    private String data;

    public Student(String d) {
        data = d;
    }

    public String toString() {
        return "Data: " + data;
    }

    @Override
    public Object getKey() {
        return data;
    }

    @Override
    public int compareTo(Object otherData) {
        return (((String) getKey()).compareTo((String) otherData));
    }
}
