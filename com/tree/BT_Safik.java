package com.tree;

import java.util.Scanner;

public class BT_Safik

{
    public int value;
    public Node right;
    public Node left;



    public static class  Node{     // here i make it static because , i use this class in main method and main methos is
                                    // static method and static method can access static data member(variable,method,class)
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }
    Node createNode(Scanner scanner, Node node){

        System.out.println("Do you want to enter left of "+ node.value);
        char left = scanner.next().charAt(0);
        if (left=='y'){
            System.out.println("Enter the value of the left of "+ node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            createNode(scanner, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        char right = scanner.next().charAt(0);
        if (right=='y'){
            System.out.println("Enter the value of the right of "+ node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            createNode(scanner, node.right);
        }

         return node;
    }
    public static void displayPreOrder(Node node ){
        if (node == null){
            return;
        }
        System.out.print( node.value+" ");
        displayPreOrder(node.left);
        displayPreOrder(node.right);

    }


    public static void main(String[] args) {
        BT_Safik abc = new BT_Safik();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of root node");
        int value = sc.nextInt();
        Node rootNode= new Node(value);
        Node root = abc.createNode(sc,rootNode);


    }

}
