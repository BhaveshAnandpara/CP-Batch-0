package Searching;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = end / 2;

        int lowestIndex  = 0; // index of lowest Value ( basically the first value of sorted array)
        int lowest = nums[0];

        if( nums.length == 1 ) {  // for arrays of lenth 1
            if( nums[0] == target ) return 0;
            else return -1;
        }

        while(  start <= end  ){

            mid = start + (  end - start ) / 2;

            if( nums[mid] == target ) return mid;

            if( nums[mid] >= lowest ) start = mid + 1 ; // if ( the value is bigger than lowest we check for right cause the pivoted elements might be there )

            else if(nums[mid] < lowest) {  

                lowest = nums[mid];
                lowestIndex = mid;
                end = mid - 1;


                }


        }

        // if lowestIndex == 0 means no pivot perform normal binary search
        if( lowestIndex == 0 ) return bSearch( nums , target  , 0 , nums.length - 1);

        
        if( target >= nums[0] ){
            return bSearch( nums , target  , 0 , Math.abs(lowestIndex - 1));
        }
        else{
            return bSearch( nums , target  , lowestIndex , nums.length - 1);
        }

    }

    public static int bSearch( int[] nums , int target , int startIndex  , int lastIndex){

        int start = startIndex;
        int end = lastIndex;
        int mid = end / 2;

        while( start <= end ){

            mid = start + (  end - start ) / 2;

            if( nums[mid] == target ) return mid;
            if( nums[mid] > target ) end = mid - 1;
            else start = mid + 1;

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        // int[] nums = {1,2,3,4,5,6};
        // int[] nums = {1 };
        int target = 2;

        System.out.println( search( nums , target )  );
        
    }
    
}
