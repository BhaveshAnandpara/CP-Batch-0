package Sorting;
import java.util.*;

// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public static int minimumSum(int num) {

        int minSum = 0;
        String strNum = num + "";

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)strNum.charAt(i)) - (int)'0';
        }

        Arrays.sort(arr);
        
        minSum = (arr[0]*10 + arr[2]) + (arr[1]*10 + arr[3]);

        if( ( (arr[0]*100 + arr[1]*10 + arr[2]) + arr[3] ) < minSum){
            minSum = (arr[0]*100 + arr[1]*10 + arr[2]) + arr[3];
        }

        return minSum;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 2932;

        System.out.println( minimumSum(n));

        sc.close();
        
    }
    
}
