package Sorting;
import java.util.*;
// https://leetcode.com/problems/sort-even-and-odd-indices-independently/

import java.util.Scanner;

public class SortEvenAndOddIndicesIndependently {

    public static int[] sortEvenOdd(int[] nums) {
        
        int[] evenArr = new int[ (nums.length + 1) / 2 ];
        int[] oddArr = new int[ nums.length / 2 ];

        for (int i = 0; i < nums.length; i++) {
            
            if( (i & 1) == 0 ) evenArr[i/2] = nums[i];
            else oddArr[i/2] = nums[i];

        }
        
        Arrays.sort( evenArr );
        Arrays.sort( oddArr );
        
        for( int i = 0 ; i < nums.length ; i++){

            if( (i & 1) == 0 ) nums[i] = evenArr[i/2];
            else nums[i] = oddArr[ (oddArr.length) - i/2 - 1 ];

        }

        return nums;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {4,1,2,3};

        System.out.println( sortEvenOdd( nums ) );

        sc.close();
        
    }
    
}
