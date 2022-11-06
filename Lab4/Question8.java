public class Question8 {

    public static void main(String[] args) {
        String s = "";
        int temp = 0;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(9);
        myLinkedList.add(9);
        myLinkedList.add(9);
        myLinkedList.add(1);
        //System.out.println(myLinkedList);

        for (int i = 0; i < myLinkedList.size(); i++) {
            s += myLinkedList.getAt(i);
        }
        temp = Integer.valueOf(s) + 1;
        s = Integer.toString(temp);
        for (int i = 0; i < myLinkedList.size(); i++) {
            myLinkedList.setAt(Character.getNumericValue(s.charAt(i)), i);
        }

        System.out.println(myLinkedList);


    }
}
