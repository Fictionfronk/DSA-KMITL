public class Lab8Task1 {

    public static void printArray(int[] a, int i) {
        if (i == a.length) return;
        System.out.print(a[i] + " ");
        printArray(a, i + 1);
    }

    public static void printReverse(int[] a, int i) {
        if (i < 0) return;
        System.out.print(a[i] + " ");
        printReverse(a, i - 1);
    }

    public static void printArrayAndReverse(int[] a) {
        int i = 0, j = a.length - 1;
        printArray(a, i);
        printReverse(a, j);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        //printReverse(a, a.length - 1);
        printArrayAndReverse(a);
    }
}
