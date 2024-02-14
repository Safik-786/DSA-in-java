package com.binarySearch;
//         position of a infinite sorted array
public class infiniteSortedArray {
    static  int answer(int[] arr, int target)
    {
        int start =0;
        int end = 1;
        while (target > arr[end]) {
            int temp=end + 1;           // Here bugs were appearing
            end= end+( (end-start+1)*2);
//            start = newstart;
        }
        return binarySearch(arr,start,end,target);

    }
    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start<=end){
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target >arr[mid]){
                start= mid+1;
            }
            else
                end = mid-1 ;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{23, 45, 66, 69, 71, 73, 85, 94, 99};

        int index = answer(arr, 66 );
        if (index != -1) {
            System.out.println("item found at " + index + " index");
        } else
            System.out.println("element cant found");
    }
}
