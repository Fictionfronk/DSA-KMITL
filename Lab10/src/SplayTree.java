public class SplayTree {
    private TreeNode root;

    public SplayTree() {
        root = null;
    }

    public void rightRotate(TreeNode node) {
        TreeNode p = node.left;
        node.left = p.right;
        if (p.right != null) p.right.parent = node;
        p.parent = node.parent;
        if (node.parent == null) root = p;
        else if (node == node.parent.right) {
            node.parent.right = p;
        } else node.parent.left = p;
        p.right = node;
        node.parent = p;
    }

    public void leftRotate(TreeNode node) {
        TreeNode p = node.right;
        node.right = p.left;
        if (p.left != null) p.left.parent = node;
        p.parent = node.parent;
        if (node.parent == null) root = p;
        else if (node == node.parent.left) {
            node.parent.left = p;
        } else node.parent.right = p;
        p.left = node;
        node.parent = p;
    }

    public void splay(TreeNode n) {
        while (n.parent != null) { //node is not root
            if (n.parent == this.root) { //node is child of root, one rotation
                if (n == n.parent.left) {
                    rightRotate(n.parent);
                } else {
                    leftRotate(n.parent);
                }
            } else {
                TreeNode p = n.parent;
                TreeNode g = p.parent; //grandparent

                if (n.parent.left == n && p.parent.left == p) { //both are left children
                    rightRotate(g);
                    rightRotate(p);
                } else if (n.parent.right == n && p.parent.right == p) { //both are right children
                    leftRotate(g);
                    leftRotate(p);
                } else if (n.parent.right == n && p.parent.left == p) {
                    leftRotate(p);
                    rightRotate(g);
                } else if (n.parent.left == n && p.parent.right == p) {
                    rightRotate(p);
                    leftRotate(g);
                }
            }
        }
    }

    public void add(int i) {
        if (root == null) root = new TreeNode(i);
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (current.data > i) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new TreeNode(i);
                        splay(parent.left);
                        break;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = new TreeNode(i);
                        splay(parent.right);
                        break;
                    }
                }
            }
        }
    }

    public TreeNode search(int d) {
        if (root == null) return null;
        TreeNode current = root;
        int currentItem = current.data;
        while (currentItem != d) {
            if (currentItem > d) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) return null;
            else {
                currentItem = current.data;
                splay(current);
            }
        }
        return current;
    }

    public class TreeNode {
        TreeNode left, right, parent;
        int data;

        public TreeNode(int d) {
            data = d;
            left = null;
            right = null;
            parent = null;
        }

    }
}