public class Node {
    private TreeItem item;
    private Node left;
    private Node right;

    public Node(TreeItem i, Node l, Node r) {
        item = i;
        left = l;
        right = r;
    }

    public TreeItem getTreeItem() {
        return item;
    }

    public void setTreeItem(TreeItem i) {
        item = i;
    }

    public Node getLeftChild() {
        return left;
    }

    public void setLeftChild(Node l) {
        left = l;
    }

    public Node getRightChild() {
        return right;
    }

    public void setRightChild(Node r) {
        right = r;
    }
}
