public class Question10 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(Character.valueOf('R')); //82
        myLinkedList.add(Character.valueOf('A')); //65
        myLinkedList.add(Character.valueOf('D')); //68
        myLinkedList.add(Character.valueOf('A')); //65
        myLinkedList.add(Character.valueOf('R')); //82
        //System.out.println(myLinkedList);

        System.out.println(myLinkedList.isPalindrome());
    }
}
