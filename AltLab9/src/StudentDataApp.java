public class StudentDataApp {
    public static void main(String[] args) {
        BST bst = new BST();
        int n = 1000000;
        long start = System.currentTimeMillis();
/*        for (int i = 0; i < n; i++) {
            bst.insert(new Student(String.valueOf(i)));
        }*/
        for (int i = 0; i < n; i++) {
            bst.insert(new Student(String.valueOf(n * Math.random())));
        }
        long time = (System.currentTimeMillis() - start);
        System.out.println(n + " \t" + time);
    }
}
