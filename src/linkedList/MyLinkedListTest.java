package linkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();

        ll.addLast(11);
        ll.addLast(12);
        ll.addLast(13);
        ll.addLast(14);
        ll.addLast(15);
        ll.addLast(16);
        ll.addLast(17);
        ll.addLast(18);
        ll.addLast(19);
        ll.addLast(20);
        System.out.println(ll);

        ll.add(4,9);
        ll.add(4,5);
        System.out.println(ll);

        ll.addFirst(30);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        System.out.println(ll.size());

        System.out.println(ll.get(3));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


    }
}