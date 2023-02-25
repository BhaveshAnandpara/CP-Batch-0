package Arrays;
// https://leetcode.com/problems/maximum-subarray/
// https://www.youtube.com/watch?v=w_KEocd__20&ab_channel=takeUforward

public interface MaximumSubarray {

    public static int maxSubArray(int[] nums) {


        // return bruteForce(nums); // DOes not work for large arrays ( Time Limit Exceeds )
        return kadaneAlgo(nums); // DOes not work for large arrays ( Time Limit Exceeds )

    }

    public static int kadaneAlgo(int[] nums ){  //O ( n )


        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            
            sum+= nums[i];

            if( sum < 0  ) sum = 0;

            if( sum > max  ) max = sum;

        }

        return max;


    }

    public static int bruteForce( int[] nums ){ // ( O( n2 ) )

        int maxSum = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            
            sum = 0;

            for (int j = i; j < nums.length; j++) {
                
                sum += nums[j];

                if( sum > maxSum ) maxSum = sum;

            }

        }

        return maxSum;


    }

    
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));

    }

}
