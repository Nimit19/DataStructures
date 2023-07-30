package Linked_list;


public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);

        if(head == null) {
            node.prev = null;
            node.next = null;
            head = node;
            return;
        }

        Node last = head;

        while(last.next != null){
            last = last.next;
        }
        node.prev= last;
        node.next = null;
        last.next = node;
    }

    public void insertAfter(int after, int value){
        Node p = find(after);

        if(p == null){
            System.out.println("Node does not exist...");
            return;
        }

        Node node = new Node(value);
        node.prev = p;
        node.next = p.next;
        if(p.next != null){
            p.next = node;
            p.next.prev = node;
        }


    }

    public Node find(int value) {

        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void displayReverse(){

        Node last = head;

        while(last.next != null){
            last = last.next;
        }

        System.out.println("Print in Reverse: ");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
