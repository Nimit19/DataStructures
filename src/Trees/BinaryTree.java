package Trees;

import java.util.Scanner;

public class BinaryTree {

    private Node root;
    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void populate(Scanner sc) {
        System.out.print("Enter the value of root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    public void populate(Scanner sc,Node node) {
        System.out.print("Do you want to enter left of "+ node.val + ": ");
        boolean left = sc.nextBoolean();

        if(left) {
            System.out.print("Enter the value of the left of "+ node.val + ": ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }

        System.out.print("Do you want to enter right of "+ node.val + ": ");
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.print("Enter the value of the right of "+ node.val + ": ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);
        }

    }

    public void display(){
        display(this.root);

    }

    private void display(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.val);
        display(node.left);
        display(node.right);
    }

}
