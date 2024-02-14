package com.tree;

public class BT_ShraddhaEdited
{
    class  Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    int index= -1;
    public Node buildTree(int arr[]){
        index++;
        if (arr[index]==-1){
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        return newNode;
    }
    public void preorder(Node root){
        if (root== null){
            System.out.print("-1  ");
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public int countNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes =countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1 ;
    }
    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static int countHeight(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = countHeight(root.left);
        int rightHeight = countHeight(root.right);
        int netHeight = Math.max( leftHeight , rightHeight) + 1;
        return netHeight ;
    }
    public int countDiameter(Node root){
        if (root == null) {
            return 0;
        }
        int viaLST = countDiameter(root.left);
        int viaRST = countDiameter(root.right);
        int viaRootDia = countHeight(root.left) + countHeight(root.right) + 1 ;

        return Math.max(viaRootDia, Math.max(viaLST,viaRST));
    }
    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public  TreeInfo countDiameter2(Node root){
        if (root == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = countDiameter2(root.left);
        TreeInfo right = countDiameter2(root.right);
        int myHeight = Math.max(left.height , right.height ) +1 ;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1 ;

        int myDiam = Math.max(diam3, Math.max(diam1,diam2));
        TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        BT_ShraddhaEdited td = new BT_ShraddhaEdited();
        int arr[]= {7,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = td.buildTree(arr);
        td.preorder(root);

    }
}
