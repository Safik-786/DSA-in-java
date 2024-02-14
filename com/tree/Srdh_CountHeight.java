package com.tree;
import com.tree.BT_ShraddhaEdited.*;

public class Srdh_CountHeight
{
    public static void main(String[] args) {

    BT_ShraddhaEdited obj = new BT_ShraddhaEdited();
    int arr[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT_ShraddhaEdited.Node root = obj.buildTree(arr);
    int height = BT_ShraddhaEdited.countHeight(root);
    System.out.println("Height is "+ (height-1));

    }
}
