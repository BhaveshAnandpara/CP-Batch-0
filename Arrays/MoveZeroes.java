package Arrays;
// https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        /*
         * 
         * // Brute Force and Naive Approach
         * int count = 0;
         * 
         * if (nums.length <= 1) {
         * for (int i : nums) {
         * System.out.println(i);
         * }
         * }
         * 
         * else {
         * 
         * for (int i = 0; i < nums.length; i++) {
         * 
         * count = 0;
         * 
         * for (int j = 0; j < nums.length - i - 1; j++) {
         * 
         * if (nums[j] == 0) {
         * nums[j] = nums[j + 1];
         * nums[j + 1] = 0;
         * count++;
         * }
         * 
         * }
         * 
         * if (count == 0) {
         * break;
         * }
         * }
         * 
         * for (int i : nums) {
         * System.out.println(i);
         * }
         * 
         * }
         * 
         */
        // Snowball Approach
        // --> if you encounter 0 swap it with non-zero if meet another 0 take it with
        // you
        // https://leetcode.com/problems/move-zeroes/solutions/172432/the-easiest-but-unusual-snowball-java-solution-beats-100-o-n-clear-explanation/?orderBy=most_votes

        int snowballCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if( nums[i] ==  0  ){
                snowballCount++;
            }
            else if ( snowballCount > 0  ){

                nums[i - snowballCount ] = nums[i];
                nums[ i ] = 0;
                
            }

            
        }

        for (int i : nums) {
            System.out.println(i);
        }



    }

    public static void main(String[] args) {

        int[] nums = { 0 , 1};
        moveZeroes(nums);

    }

}
