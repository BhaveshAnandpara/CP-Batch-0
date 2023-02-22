package Arrays;
// https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int resultCount = 0;

        for (int i = 0; i < nums.length; i++) {
            
            
            if( nums[i] == 1 ) count++;
            if( nums[i] != 1 ) {
                if( count > resultCount ) resultCount = count;
                count = 0;
            }
            
        }        

        return Math.max(count, resultCount);
        
    }

    public static void main(String[] args) {

        int[] nums = {1,0};

        System.out.println( findMaxConsecutiveOnes(nums) );
        
    }
    
}
