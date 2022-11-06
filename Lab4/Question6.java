public class Question6 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        //myLinkedList.add(6);
        //myLinkedList.add(7);
        //myLinkedList.add(8);
        //myLinkedList.add(9);
        //myLinkedList.add(10);

        //System.out.println(myLinkedList);

        System.out.println(myLinkedList.getAt(myLinkedList.size() / 2));


    }
}
