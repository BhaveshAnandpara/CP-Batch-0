package Searching;
// https://leetcode.com/problems/binary-search/

public class BinarySearch {

    public static int search(int[] nums, int target) {
        
        int start = 0 ;
        int end = nums.length - 1;

        int mid = end/2;

        while( start <= end ){

            mid = start + ( end - start ) / 2;

            if( nums[mid] == target ) return mid;

            if( nums[mid] > target ) end = mid -1;
            else start = mid + 1;

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println( search( nums , target ));
        
    }
    
}
