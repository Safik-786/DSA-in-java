package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class _1_balancedBracket {

    public static boolean validParenthesis(String str){
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }

            else if (ch == ')'){
                if (stack.peek()=='('){
                    stack.pop();
                }
            }
            else if (ch == '}'){
                if (stack.peek()=='{'){
                    stack.pop();
                }
            }
            else if (ch == ']'){
                if (stack.peek()=='['){
                    stack.pop();
                }
            }
        }
        if (stack.size()==0){
        return true;
        }
        return false;

    }
    public  static int countDel(String str){
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }
            else {

                if (stack.size()==0){
                    stack.push(ch);
                    continue;
                }
                 if (stack.peek() == '(') {
                    stack.pop();
                }
                else if(stack.peek()==')') {
//                     System.out.println("fuck");
                    stack.push(ch);
                }
            }
        }
        System.out.println(stack);
        int x =stack.size();


        return x;
    }
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }
            else {
                if (stack.size() == 0) {
                    return false;
                }
                else if (stack.peek() == '(') {
                    stack.pop();
                }
            }


        }
        int brktToRmv = stack.size();
        System.out.println("no of bracket is remove to make it balance is : "+brktToRmv);
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string that contain brackets ( :");
        String str = sc.nextLine();
//        System.out.println(isBalanced(str));
//        System.out.println(countDel(str));
        System.out.println(validParenthesis(str));
    }
}
