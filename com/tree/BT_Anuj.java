package com.tree;
import com.tree.BT_Safik.*;

import java.util.Scanner;

public class BT_Anuj
{
//    BT_Safik.Node obj = new BT_Safik.Node(data);
    static Scanner scanner=new Scanner(System.in);


    static BT_Safik.Node createNode() {
        BT_Safik.Node root = null;
        System.out.println("Enter Data: ");
        int data = scanner.nextInt();
        if (data ==-1){
            return  null;
        }
        root = new BT_Safik.Node(data);
        System.out.println("Enter left of "+ data);
        root.left =createNode();

        System.out.println("Enter right of "+data);
        root.right = createNode();
        return root;
    }


    public static void main(String[] args) {
        BT_Safik.Node root1 = createNode();
        BT_Safik.displayPreOrder(root1);

    }
}
