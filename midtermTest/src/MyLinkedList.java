public class MyLinkedList {
    Node head = null;

    public static boolean methodA(Node node) {
        if ((node == null) || (node.next == null)) {
            return true;
        }
        else if (node.data > node.next.data) {
            return false;
        }
        return false;
    }

    public void add(int d) {
        Node p = new Node(d);
        p.next = head;
        head = p;
    }

    public void insert(int d, Node p) {
        Node q = new Node(d);
        q.next = p.next;
        p.next = q;
    }

    public Node find(int d) {
        Node p = head;
        while (p != null) {
            if (p.data == d) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public void delete(int d) {
        Node t = new Node(0);
        t.next = head;
        Node p = t;
        while ((p.next != null) && (p.next.data != d)) {
            p = p.next;
        }
        if (p.next != null) {
            p.next = p.next.next;
        }
        head = t.next;
    }

    public int getAt(int i) {
        Node p = head;
        while (i > 0) {
            p = p.next;
            i--;
        }
        return p.data;
    }

    public void setAt(int d, int i) {
        Node p = head;
        while (i > 0) {
            p = p.next;
            i--;
        }
        p.data = d;
    }

    public int size() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count += 1;
            p = p.next;
            //System.out.println(count);
        }
        return count;
    }

    public Boolean isPalindrome() {
        String s1 = "";
        String s2 = "";
        Node p = head;
        while (p != null) {
            s1 += Character.toString(p.data);
            p = p.next;
        }
        //System.out.println("s1: " + s1);
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += Character.toString(s1.charAt(i));
        }
        //System.out.println("s2: " + s2);
        return s1.equals(s2);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("head ");
        Node p = head;
        while (p != null) {
            sb.append("--> [");
            sb.append(p.data);
            sb.append("] ");
            p = p.next;
        }
        sb.append("-> null");
        return new String((sb));
    }

    public class Node {
        private int data;
        private Node next;

        public Node(int d) {
            this.data = d;
        }
    }
}
