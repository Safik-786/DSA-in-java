package com.recursion;

public class pallindrome
{
    public static boolean helper(int n){
        int digit =  (int) Math.log10(n)+1 ;
        return n == ReverseNumber.reverse(n , digit);
    }

    public static void main(String[] args) {
        int n =12121;
        boolean b = helper(n);
        if (b){
            System.out.println( n +" is a pallindrome number.");
        }
        else {
            System.out.println(n +" is not a pallindrome number. ");
        }
    }
}
