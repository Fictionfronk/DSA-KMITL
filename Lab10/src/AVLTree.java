public class AVLTree {
    private TreeNode root;

    public AVLTree() {
        root = null;
    }

    public int height(TreeNode node) {
        return node != null ? node.height : -1;
    }

    public void updateHeight(TreeNode node) {
        int h_left = height(node.left);
        int h_right = height(node.right);
        node.height = Math.max(h_left, h_right) + 1;
    }

    public int getBalFactor(TreeNode node) {
        return height(node.right) - height(node.left);
    }

    public TreeNode rotateRight(TreeNode node) {
        TreeNode leftChild = node.left;

        node.left = leftChild.right;
        leftChild.right = node;

        updateHeight(node);
        updateHeight(leftChild);

        return leftChild;
    }

    public TreeNode rotateLeft(TreeNode node) {
        TreeNode rightChild = node.right;

        node.right = rightChild.left;
        rightChild.left = node;

        updateHeight(node);
        updateHeight(rightChild);

        return rightChild;
    }

    public TreeNode rebalance(TreeNode node) {
        int balanceFactor = getBalFactor(node);

        // Left-heavy?
        if (balanceFactor < -1) {
            if (getBalFactor(node.left) <= 0) {    // Case 1
                // Rotate right
                node = rotateRight(node);
            } else {                                // Case 2
                // Rotate left-right
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }
        }

        // Right-heavy?
        if (balanceFactor > 1) {
            if (getBalFactor(node.right) >= 0) {    // Case 3
                // Rotate left
                node = rotateLeft(node);
            } else {                                 // Case 4
                // Rotate right-left
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }
        return node;
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
                        break;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = new TreeNode(i);
                        break;
                    }
                }
            }
            updateHeight(parent);
            rebalance(parent);
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
            else currentItem = current.data;
        }
        return current;
    }

    public class TreeNode {
        TreeNode left, right;
        int data, height;

        public TreeNode(int d) {
            data = d;
            left = null;
            right = null;
        }

    }
}