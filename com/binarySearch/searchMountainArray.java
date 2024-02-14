package com.binarySearch;

public class searchMountainArray
{
    static int search(int[]arr, int target){
        int peak = peakPoint(arr);
        if (peak != -1) {
            return OrderAnosticBinarySearch(arr,target,0,peak);
        }
        return OrderAnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
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
    static int OrderAnosticBinarySearch( int[]arr,int target ,int start, int end){

        boolean isAscend =arr[start] < arr[end];
        while(start<=end){
            int mid = (start + end)/2;
            if (arr[mid]== target){
                return mid;
            }
            if (isAscend){
                if (target>arr[mid]){
                    start= mid+1;
                }
                else
                    end = mid-1 ;
            }
            else {
                if (target>arr[mid]){
                    start= mid-1;
                }
                else
                    end = mid+1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3,  5,  7, 9, 4, 3,2,1};
        int index= search(arr,9);
        System.out.println("index of "+arr[index]+" is "+index);
    }

}
