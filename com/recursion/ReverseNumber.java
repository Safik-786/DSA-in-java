package com.recursion;

public class ReverseNumber
{
    public static void helper(int n){
        int digit = (int) Math.log10(n)+1 ;
//        System.out.println(digit);
        int a = reverse(n,digit);
        System.out.println(a);
    }
    public static int reverse(int n, int digit){
        if (n%10 ==n){
            return n;
        }
        int rem =n%10;
        return rem*(int)Math.pow(10,digit-1) + reverse(n/10,(digit-1));
    }

    public static void main(String[] args) {
        helper(23437897);
    }
}
