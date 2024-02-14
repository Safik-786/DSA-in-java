package com.tree;

public class BT_Shraddha
{
    static class  Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree{
        static  int index =-1;              //  here variable is static because static method can access only static variable.
        public static Node buildTree(int arr[]){
            index++;
            if (arr[index]==-1){
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int arr[]= {7,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(root.data);
    }
}
