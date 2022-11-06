public interface BSTADT {
    public TreeItem find(Object k);

    public void insert(TreeItem i);

    public TreeItem findMinKeyItem();

    public TreeItem findMaxKeyItem();

    public boolean delete(Object k);
}
