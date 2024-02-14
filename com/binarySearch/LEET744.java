package com.binarySearch;
//         FIND SMALLEST AND GREATER ELEMENT THAN TARGET
public class LEET744
{
    static char nextBigLetter( char[]arr , char item) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid  = start + (end - start) / 2;

            if (item < arr[mid]) {
                end = mid -1;
            } else
            {
                start = mid + 1;
            }
        }
        return arr[ start % arr.length];
    }


    public static void main(String[] args) {
        char []arr ={'a','c','f','m','z'};
        char index =nextBigLetter(arr,'m');
        System.out.println("item found is "+ index);
    }
}
