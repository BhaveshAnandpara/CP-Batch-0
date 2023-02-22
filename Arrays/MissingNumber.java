package Arrays;
// https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for (int i = 0, j = n - 1; j >= i; i++ , j--) {

            if (i == j)
                sum += nums[i];
            else {
                sum += nums[i] + nums[j];
            }

        }

        return ( (n * ( n + 1)) / 2 ) - sum ;

    }

    public static void main(String[] args) {

        int[] nums = { 9,6,4,2,3,5,7,0,1 };

        System.out.println(missingNumber(nums));

    }

}
