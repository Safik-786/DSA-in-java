package com.Stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void iterativeMethod(int[] arr) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            res[i]= -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    res[i]= arr[j];
                    break;
                }
            }
        }

        System.out.println("next Greater element list using bruteforce method is : ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ "  ");
        }
        System.out.println();

    }
    public static void previousGreaterElementUsingStack(int[]  arr){
        Stack<Integer> stk = new Stack<>();
        int res[] = new int[arr.length];
        int n = arr.length;
        res[0]=-1;
        stk.push(arr[0]);
        for (int i = 1 ;i < n ; i++){
            while ( stk.size()> 0 && stk.peek()<arr[i] ){
                stk.pop();
            }
            if (stk.size()==0){
                res[i]=-1;
            }
            else {
                res[i]= stk.peek();
            }
            stk.push(arr[i]);
        }
        System.out.println("previous greater element list using stack is :");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ "  ");
        }
    }

        public static void nextGreaterElementUsingStack(int[]  arr){
        Stack<Integer> stk = new Stack<>();
        int res[] = new int[arr.length];
        int n = arr.length;
        res[n-1]=-1;
        stk.push(arr[n-1]);
        for (int i = n-2 ;i>=0 ; i--){
            while ( stk.size()> 0 && stk.peek()<arr[i] ){
                stk.pop();
            }
            if (stk.size()==0){
                res[i]=-1;
            }
            else {
                res[i]= stk.peek();
            }
            stk.push(arr[i]);
        }

        System.out.println("next Greater element list using stack is :");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ "  ");
        }
    }

    public static void stockSpan(int[] arr){
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int res[] = new int[arr.length];
        int n = arr.length;
        res[0]=-1;
        stk.push(arr[0]);
        for (int i = 1 ;i < n ; i++){
            if (stk2.size()>0){
                stk2.clear();
            }
            while ( stk.size()> 0 && stk.peek()<arr[i] ){
                stk2.push(stk.pop());
            }
            if (stk.size()==0){
                res[i]=-1;
            }
            else {
                res[i]= stk.peek();
            }
            stk.push(arr[i]);
        }
        System.out.println("previous greater element list using stack is :");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Iterative Method   T.C= [O(n2)] & Stact method T.C = [O(n)]");
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println("Given array is :" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
        iterativeMethod(arr);               //  time complexity O[n(square)]
        nextGreaterElementUsingStack(arr);

        System.out.println();
        previousGreaterElementUsingStack(arr);
    }
}
