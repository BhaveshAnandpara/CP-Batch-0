package Arrays;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {


        if( nums.length <= 1 ) return nums.length;

        int count = 0;
        int prev = nums[0];
        int temp = 0;

        for (int i = 1; i < nums.length; i++) {

            if( nums[i] < prev ) break;

            if ( nums[i] > prev) {
                count++;
                prev = nums[i];

                temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;

            }


        }



        return count + 1;

    }

    public static void main(String[] args) {

        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 1,1,2 };
        int[] nums = { 2 , 2};

        System.out.println(removeDuplicates(nums));

    }

}
