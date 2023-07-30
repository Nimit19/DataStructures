package Linked_list;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

//    // Without using tail
//    public void insertLast(int value) {
//
//        Node node = new Node(value);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = node;
//        tail = node;
//        size += 1;
//    }
   //  using tail
    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertIndex(int value,int index) {

        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size - 1){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;

        size += 1;

    }

    public int deleteFirst() {

        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size -= 1;

        return val;


    }

    public int deleteLast() {

        if(size <= 1){
            deleteFirst();
        }

        int val = tail.value;
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;

        size -= 1;

        return val;
    }

    public int deleteIndex(int index) {

        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }


    public Node find(int value) {

        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }

        return null;

    }

    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;

    }

    public void display(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }




    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
