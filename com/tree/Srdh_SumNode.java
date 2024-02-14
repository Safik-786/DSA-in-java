package com.tree;

public class Srdh_SumNode
{
    public static void main(String[] args) {
        BT_ShraddhaEdited se = new BT_ShraddhaEdited();
        int arr[]= {72,27,49,-1,-1,51,-1,-1,33,-1,66,-1,-1};
        BT_ShraddhaEdited.Node root = se.buildTree(arr);
        System.out.println(se.sumOfNodes(root));
    }
}
