package com.binarySearch;
//      PEAK INDEX OF A MOUNTAIN ARRAY
public class LEET_852
{
    static int peakPoint(int[]arr){
        int start= 0;
        int end= arr.length-1;
        while (start < end){
            int mid= (start+end)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;          //  end = mid ;  this is because ans can be mid element as it is descending sort
            } else if (arr[mid]< arr[mid + 1]) {
                start=mid+1;            //  start = mid+1 ; this is because answer can be  mid+1 element as it is ascending sort
            }

        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3,  5,  7, 9, 4, 3,2,1};
        int peak= peakPoint(arr);
        System.out.println(arr[peak]);
    }
}
