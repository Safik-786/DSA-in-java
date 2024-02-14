package com.binarySearch;

public class flooring
{
    static int Flooring(int[]arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else
                end = mid-1 ;
        }
        return end;
    }
    public static void main(String[] args) {
        int []arr ;
        arr = new int[]{23,45,66,69,71,73,85,94,99 };

        int index = Flooring(arr,43);
        if (index != -1) {
            System.out.println("item found at "+ index+" index");
        }
        else
            System.out.println("element cant found");
    }
}
