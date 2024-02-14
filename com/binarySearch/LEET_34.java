package com.binarySearch;
//      FIND FIRST AND LAST POSITION OF THE ELEMENT IN A SORTED ARRAY
public class LEET_34
{
    static int[] searchIndex(int[]nums, int target)
    {
        int ans[] ={-1,-1};
        int start= search(nums, target, true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[]arr, int target, boolean fromFirst){
        int start = 0;
        int end = arr.length - 1;
        int ans =-1;
        while (start<=end){
            int mid = (start + end) / 2;
            if (target < arr[mid]){
                end= mid -1;
            }
            else if (target > arr[mid]){
                start= mid+1;
            }
            else {
                ans = mid;

                if (fromFirst) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int []arr ;
        arr = new int[]{5,7,7,8,8,10 };

        int [] index = searchIndex(arr,8);
        System.out.println(index[0]+","+index[1]);
    }
}
