package Linked_list;

public class Main {
    public static void main(String[] args) {

//        // Singly Linked list
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(15);
//        list.insertFirst(52);
//        list.insertFirst(8);
//        list.insertFirst(100);
//        list.display();
//
//        list.insertLast(19);
//        list.display();
//
//        list.insertIndex(38,2);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.deleteIndex(1));
//        list.display();


//        // Doubly linked list
//        DLL list = new DLL();
//        list.insertFirst(10);
//        list.insertFirst(50);
//        list.insertFirst(85);
//        list.insertFirst(94);
//        list.insertFirst(62);
//        list.display();
//        list.displayReverse();
//
//        list.insertLast(19);
//        list.display();
//
//        list.insertAfter(50,60);
//        list.display();

        // Circular linked list
        CLL list = new CLL();
        list.insert(10);
        list.insert(54);
        list.insert(19);
        list.insert(38);
        list.insert(29);
        list.insert(23);
        list.display();

        list.delete(54);
        list.display();


    }
}