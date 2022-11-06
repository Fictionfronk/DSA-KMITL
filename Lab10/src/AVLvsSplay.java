import java.util.Random;

public class AVLvsSplay {

    static int nextGaussian(Random r, int mean) {
        return (int) (r.nextGaussian() * mean / 2) + mean;
    }

    public static void main(String[] args) {
        int start = 10000; // change to fit your machine
        int step = 10000; // change to fit your machine

        Random r = new Random();

        // Splay Tree, ordered build
        for (int n = start; n < start + 10 * step; n += step) {
            SplayTree splay = new SplayTree();
            System.out.println("n: " + n);
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.add(i);
            System.out.println("splay ordered build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.search(i);
            System.out.println("splay ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.search(nextGaussian(r, n));
            System.out.println("splay gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        // Splay Tree, random build
        for (int n = start; n < start + 10 * step; n += step) {
            SplayTree splay = new SplayTree();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.add(r.nextInt(n));
            System.out.println("splay random build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.search(i);
            System.out.println("splay ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) splay.search(nextGaussian(r, n));
            System.out.println("splay gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        // AVL Tree, ordered build
/*        for (int n = start; n < start + 10 * step; n += step) {
            AVLTree avl = new AVLTree();
            System.out.println("n: " + n);
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.add(i);
            System.out.println("avl ordered build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.search(i);
            System.out.println("avl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.search(nextGaussian(r, n));
            System.out.println("avl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }

        // AVL Tree, random build
        for (int n = start; n < start + 10 * step; n += step) {
            AVLTree avl = new AVLTree();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.add(r.nextInt(n));
            System.out.println("avl random build: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.search(i);
            System.out.println("avl ordered access: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) avl.search(nextGaussian(r, n));
            System.out.println("avl gaussian access: " + (System.currentTimeMillis() - startTime));
            System.out.println();
        }*/

    }
}