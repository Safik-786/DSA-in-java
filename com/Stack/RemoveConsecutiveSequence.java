package com.Stack;

import java.util.Stack;

public class RemoveConsecutiveSequence
{
    public static int[] remove(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n =arr.length;
        for (int i=0;i < n; i++) {
            if (stack.size() == 0 || stack.peek()!= arr[i]){
                stack.push(arr[i]);
            }
             else if (arr[i]== stack.peek()){
                if (i==n-1 || arr[i] != arr[i+1]){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        int no = res.length;
        for (int i = no-1; i >=0 ; i--){
            res[i] = stack.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,3,10,10,10,4,4,4,4,5,7,7,2,2,10,2};
        int [] result =remove(arr);
        for (int i:result){
            System.out.println(i);
        }
    }
}
