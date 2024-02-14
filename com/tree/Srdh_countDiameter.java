package com.tree;

public class Srdh_countDiameter
{
    public static void main(String[] args) {
        BT_ShraddhaEdited obj = new BT_ShraddhaEdited();
        int arr[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT_ShraddhaEdited.Node root = obj.buildTree(arr);
        System.out.println("Diameter [O(n2)] : "+ obj.countDiameter(root));

        BT_ShraddhaEdited.TreeInfo obj2 = obj.countDiameter2(root);
        System.out.println("Diameter [O(n)] : "+obj2.diameter);
//        System.out.println(obj2.height);      // it will give the height of the tree
    }
}
