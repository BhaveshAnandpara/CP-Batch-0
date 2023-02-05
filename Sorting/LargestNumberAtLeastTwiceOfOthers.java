package Sorting;
// https://leetcode.com/problems/largest-number-at-least-twice-of-others/

import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {

        int temp = 0;
        int highest = 0; 
        int highestIndex = 0;
        int len = nums.length;


        for (int i = 0; i < 2; i++) { // Only need to run for 2 times to get 2 last highest

            for (int j = 0; j < len - 1 - i ; j++) {   // len - 1 - i because no need to compare last element as it will be highest
                
                if( (i == 0 ) && ( j + 1 == len - 1 ) && ( nums[j + 1] > nums[j] ) ) highestIndex = len - 1;  // for 1 time --> i.e to get highest element if last element of array is highest swap won't happen hence the condition

                if (nums[j + 1] < nums[j]) { 

                    if ( nums[j] > highest) {
                        highest = nums[j];
                        highestIndex = j;
                    };
                    

                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;

                    
                }

            }

        }

        return nums[len - 2] * 2 > nums[len - 1] ? -1 : highestIndex;

    }

    public static void main(String[] args) {

        int[] nums = { 1 , 0 };

        System.out.println( dominantIndex(nums) );

    }

}
