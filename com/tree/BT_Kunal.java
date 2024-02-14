package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BT_Kunal
{

    public  static  class Node {
         int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private static Node root;
    // insert elements
    public  void insert(Scanner scanner){
        System.out.println("Enter the value of root Node : ");
        int value= scanner.nextInt();
        root = new Node(value);
        createNode(scanner,root);
    }
    private void createNode(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of "+ node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            createNode(scanner, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of "+ node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            createNode(scanner, node.right);
        }

    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
    public void levelOrderDisplay(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curNode = q.remove();
            if (curNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.println(curNode.value  +" ");
                if (curNode.left!=null) {
                    q.add(curNode.left);
                }if (curNode.right!=null) {
                    q.add(curNode.right);
                }
            }

        }

    }


    public static void displayPreOrder(Node node ){
        if (node== null){
            return;
        }
        System.out.print( node.value+" ");
        displayPreOrder(node.left);
        displayPreOrder(node.right);

    }

    public  void displayInOrder(Node node ){
        if (node== null){
            return;
        }
        displayPreOrder(node.left);
        System.out.print( node.value+" ");
        displayPreOrder(node.right);


    } public  void displayPostOrder(Node node ){
        if (node== null){
            return;
        }
        displayPreOrder(node.left);
        displayPreOrder(node.right);
        System.out.print( node.value+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT_Kunal imp = new BT_Kunal();
        imp.insert(sc);
        System.out.println("Preorder Traversal is : ");
        displayPreOrder(root);
        System.out.println("InOrder Traversal is : ");
        imp.displayInOrder(root);
        System.out.println("PostOrder Traversal is : ");
        imp.displayPostOrder(root);
        System.out.println("level Order Traversal : ");
        imp.levelOrderDisplay(root);
    }
}
