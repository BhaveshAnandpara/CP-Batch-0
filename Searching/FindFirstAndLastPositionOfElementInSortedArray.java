package Searching;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstAndLastPositionOfElementInSortedArray {

    // Brute Force Approach
    // public static int[] searchRange(int[] nums, int target) {

    //     int[] result = new int[2];
    //     int end = nums.length;

    //     int mid = search(nums, target, 0 , end);

    //     System.out.println( " mid = " + mid);

    //     if( mid != -1){

    //         int firstIndex = mid;
    //         result[0] = firstIndex;
    //         while( firstIndex != -1 ){

    //             // search for lowestIndexed Value
    //             firstIndex = search( nums , target , 0  , firstIndex );
                
    //             if( firstIndex != -1) {
    //                 result[0] = firstIndex;
    //                 firstIndex = result[0];
    //             }

    //         }

    //         int lastIndex = mid;
    //         result[1] = lastIndex;
    //         while( lastIndex != -1 ){

    //             // search for highestIndexed Value
    //             lastIndex = search( nums , target , lastIndex + 1  , nums.length );
                
    //             if(lastIndex != -1 ) {
    //                 result[1] = lastIndex;
    //                 lastIndex = result[1];
    //             };
                

    //         }


    //         System.out.println( result[0] + " " + result[1]);

    //         return result;

            
    //     }
    //     else{

    //         result[0] = -1;
    //         result[1] = -1;
    //         return result;

    //     }


    // }

    // public static int search(int[] nums, int target , int startIndex , int lastIndex ) {

    //     int start = startIndex;
    //     int end = lastIndex - 1 ;

    //     int mid = end / 2;

    //     while (start <= end) {

    //         mid = start + (end - start) / 2;

    //         if (nums[mid] == target)
    //             return mid;

    //         if (nums[mid] > target)
    //             end = mid - 1;
    //         else
    //             start = mid + 1;

    //     }

    //     return -1;

    // }


    // Better Solution 

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    
    private static int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
    
    private static int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 8, 8, 10 };
        // int[] arr = {1,4};

        System.out.println( searchRange(arr, 8));

    }

}
