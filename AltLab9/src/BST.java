public class BST implements BSTADT {
    private Node root;

    public BST() {
        root = null;
    }

    @Override
    public TreeItem find(Object k) {
        if (root == null) return null;
        Node current = root;
        TreeItem currentItem = current.getTreeItem();
        while (currentItem.compareTo(k) != 0) {
            if (currentItem.compareTo(k) > 0) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) return null;
            else currentItem = current.getTreeItem();
        }
        return currentItem;
    }

    @Override
    public void insert(TreeItem i) {
        Node newNode = new Node(i, null, null);
        if (root == null) root = newNode;
        else {
            Node current = root;
            Node parent;
            Object k = i.getKey();
            while (true) {
                parent = current;
                if (current.getTreeItem().compareTo(k) > 0) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        break;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        break;
                    }
                }
            }
        }

    }

    @Override
    public TreeItem findMinKeyItem() {
        if (root == null) return null;
        Node current, last;
        current = last = root;
        while (current != null) {
            last = current;
            current = current.getLeftChild();
        }
        return last.getTreeItem();
    }

    @Override
    public TreeItem findMaxKeyItem() {
        if (root == null) return null;
        Node current, last;
        current = last = root;
        while (current != null) {
            last = current;
            current = current.getRightChild();
        }
        return last.getTreeItem();
    }

    @Override
    public boolean delete(Object k) {
        return false;
    }
}
