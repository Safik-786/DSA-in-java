package com.recursion;

public class AddTwoNumber {
    public static int Sum(int a, int b){
        if (a==0){
            return b;
        }
        return Sum(a-1, b)+1;
    }

    public static void main(String[] args) {
        int a=Sum(34,60);
        System.out.println(a);
    }
}
