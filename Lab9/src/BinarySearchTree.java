public class BinarySearchTree {
    TreeNode root = null;

    public TreeNode search(int d, TreeNode node) {
        if (isEmpty()) return null;
        if (d == node.data) return node;
        if (d < node.data) return search(d, node.left);
        return search(d, node.right);
    }

    public void insert(int d, TreeNode node) {
        if (isEmpty()) root = new TreeNode(d);
        else {
            if (d < node.data) {
                if (node.left == null) {
                    node.left = new TreeNode(d);
                    node.left.parent = node;
                } else insert(d, node.left);
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(d);
                    node.right.parent = node;
                } else insert(d, node.right);
            }
        }
    }

    public void delete(int d, TreeNode node) {
        if (isEmpty()) return;
        if (d < node.data)
            delete(d, node.left);
        else if (d > node.data)
            delete(d, node.right);
        else {
            if (node.left == null || node.right == null) {
                TreeNode q = (node.left == null) ? node.right : node.left;
                if (node.parent.left == node) {
                    node.parent.left = q;
                } else
                    node.parent.right = q;
                if (q != null) q.parent = node.parent;
                else {
                    q = findMax(node.left);
                    delete(q.data, node.left);
                    if (node.parent.left == node)
                        node.parent.left = q;
                    else
                        node.parent.right = q;
                    q.left = node.left;
                    q.right = node.right;
                    q.parent = node.parent;
                }
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printTree(TreeNode node) {
        if (isEmpty()) return;
        System.out.println(node.data + " ");
        printTree(node.left);
        printTree(node.right);
    }

    public TreeNode findMax(TreeNode left) {
        if (root == null) return null;
        TreeNode current, last;
        current = last = left;
        while (current != null) {
            last = current;
            current = current.right;
        }
        return last;
/*        TreeNode maxNode = left;
        if (left.right == null) return maxNode;
        if (maxNode.data < left.right.data) {
            maxNode = left.right;
        }
        return findMax(maxNode);*/
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
