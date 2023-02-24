package Arrays;
// https://leetcode.com/problems/rotate-array/

import java.util.*;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;
        int len = nums.length;

        // // Approach 1 ( Not better )
        // if (k == 0 || k == len) {
        //     for (int i : nums) {
        //         System.out.println(i);
        //     }

        // } else {

        //     /*
        //      * 
        //      * // By Adding Elements to ArrayList
        //      * 
        //      * 
        //      * ArrayList<Integer> res = new ArrayList<>();
        //      * 
        //      * for (int i = len - k ; i < nums.length; i++) {
        //      * res.add(nums[i]);
        //      * }
        //      * 
        //      * for (int i = 0; i < len - k ; i++) {
        //      * res.add(nums[i]);
        //      * 
        //      * }
        //      * 
        //      * for (int i = 0; i < len; i++) {
        //      * 
        //      * nums[i] = res.get(i);
        //      * 
        //      * }
        //      */

        //     // By Using Swaping Method

        //     int temp = 0;

        //     for (int i = 0; i < k; i++) {

        //         temp = nums[k+ 1 + i];
        //         nums[k+ 1 + i] = nums[ i ];
        //         nums[i] = temp;

        //     }   

        //     for (int i : nums) {
        //         System.out.print( i + " ");
        //     }

        // }


        //Approach 2 ( Better ) ( O( 2n ) )
        // nums =  { 1, 2, 3, 4, 5, 6, 7 }; k = 3 ----> so [1,2,3,4] and [5,6,7]
        // reverse both array --. [4,3,2,1] and [7,6,5] now join them --> [4,3,2,1,7,6,5]
        // Now reverse the whole array --> [5,6,7,1,2,3,4]

        reverse(nums, 0,  len - k - 1);
        reverse(nums, len - k  , len- 1 );
        reverse(nums, 0  , len - 1 );
        
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static void reverse( int[] nums , int i , int j ){

        int temp = 0;

        while( i < j  ){

            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // int[] nums = { -1, -100, 3, 99 };
        int k = 3;

        rotate(nums, k);

    }

}
