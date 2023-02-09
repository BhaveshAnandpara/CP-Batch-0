package Searching;
// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int mid = end/2;

        while( start <= end ){

            mid = start + ( end - start ) / 2;

            if( nums[mid] == target ) return mid;

            if( nums[mid] < target ) start = mid + 1;
            else end = mid - 1;

        }

        return start;


    }

    public static void main(String[] args) {


        int[] nums = {0,3,5,6};
        int target = 90;

        System.out.println( searchInsert( nums , target ) );
        
    }
    
}
