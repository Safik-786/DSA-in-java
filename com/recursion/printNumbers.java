package com.recursion;

public class printNumbers
{
    static int print(int num,int sum)
    {
        if (num == 0) {
            return 0;
        }
        print(num-1 ,sum);
        System.out.println(num);
        sum=sum+num;
        return sum;
    }
    static void printRev(int num) {
        System.out.println(num);
        if (num == 1) {
            return;
        }
        printRev(num-1);
    }
    public static void main(String[] args) {
        print(5,0);
        System.out.println();
        System.out.println();
        printRev(5);
    }
}
