package com.linearSearch;

public class _1pair {

    public  static void pair(int []num){
        for (int i = 0; i < num.length; i++) {
            int cur_val= num[i];
            for (int j = 0; j < num.length; j++) {
                if (cur_val== num[j]){
                    continue;
                }
                System.out.println("("+ cur_val +","+num[j]+")");

            }
        }
    }
    public  static void subArray(int []num){
        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end= j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        int num[]= { 25, 72, 28, 21, 35, 28 };
        System.out.println(num);
//        for (int i : num){
//            System.out.println(i);
//        }
//        pair(num);
        subArray(num);
    }
}
