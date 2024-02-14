package com.recursion;

public class factorial
{
    static int factorial(int num){
        if (num < 2) {
            return 1;
        }
        return num* factorial(num-1);
    }
    static int sumOfNum(int num){
        if (num ==0) {
            return 0;
        }
        return num + sumOfNum(num-1);
    }

    public static void main(String[] args) {
        int res=factorial(0);
        System.out.println(res);
        int res2=sumOfNum(3);
        System.out.println(res2);
        String str="safik";
        str ="rahul";
        System.out.println(str);
    }
}
