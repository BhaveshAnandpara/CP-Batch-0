package Searching;
// https://www.hackerrank.com/challenges/sherlock-and-array/problem?isFullScreen=true

import java.util.*;

public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
    
        int start = 0;
        int end = arr.size() - 1;
        int mid = end / 2;

        while( start <= end ){

            mid = start + ( end - start ) / 2;

            if( findSum(arr, 0, mid ) < findSum(arr, mid + 1, arr.size() ) ){
                start = mid + 1;
            }
            else if( findSum(arr, 0, mid ) > findSum(arr, mid + 1, arr.size() ) ){
                end = mid -1;
            }
            else{
                return "YES";
            }

        }            

        return "NO";

    }

    public static int findSum( List<Integer> arr , int startindex  ,int lastIndex){

        int sum = 0;

        for (int i = startindex; i < lastIndex ; i++) {
            
            sum += arr.get(i);

        }


        return sum;

    }



    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>( Arrays.asList( 1,2,3 ) );

        System.out.println( balancedSums(arr) );

    }

}
