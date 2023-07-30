package Trees;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.populate(sc);
        tree.display();
    }
}
