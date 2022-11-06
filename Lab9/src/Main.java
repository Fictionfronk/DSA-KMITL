public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int n = 20841; //max
        //int n = 20000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            bst.insert(i, bst.root);

        }
/*        for (int i = 0; i < n; i++) {
            bst.insert((int) (n * Math.random()), bst.root);
        }*/
        long time = (System.currentTimeMillis() - start);
        System.out.println(n + " \t" + time);
    }
}
