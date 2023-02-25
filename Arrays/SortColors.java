package Arrays;
// https://leetcode.com/problems/sort-colors/

import javax.xml.namespace.QName;

public class SortColors {

    public static void sortColors(int[] nums) {
        
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if( nums[i] == 0 ) red++;
            if( nums[i] == 1 ) white++;
            if( nums[i] == 2 ) blue++;

        }

        white = white + red;
        blue  = blue + white;

        for (int i = 0; i < nums.length; i++) {
            
            if( i < red ) nums[i] = 0;
            else if( i >= red && i < white ) nums[i] = 1;
            else nums[i] = 2;

        }


    }

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);
        
    }
    
}
