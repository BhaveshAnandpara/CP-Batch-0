package Sorting;
// https://leetcode.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {


        int intLen = intervals.length;
        int temp =0;
        List<Integer> mergeCount = new ArrayList<>();

        for (int i = intLen - 1; i > 0; i--) {
            
            for (int j = intLen - 1; j > (intLen - 1) - i ; j--) {
                
                if( intervals[j][0] < intervals[j - 1][0]  ){

                    temp = intervals[j][0];
                    intervals[j][0] = intervals[j - 1][0];
                    intervals[j - 1][0] = temp;

                    temp = intervals[j][1];
                    intervals[j][1] = intervals[j - 1][1];
                    intervals[j - 1][1] = temp;
                    
                }

            }


            if( i != intLen - 1   ){

                if( intervals[ intLen - i - 2 ][ 1 ] >= intervals[ intLen - i - 1 ][ 0 ]){

                    intervals[ intLen - i - 1 ][ 0 ] = Math.min(intervals[ intLen - i - 2 ][ 0 ] ,intervals[ intLen - i - 1 ][ 0 ] );
                    intervals[ intLen - i - 1 ][ 1 ] = Math.max(intervals[ intLen - i - 2 ][ 1 ] ,intervals[ intLen - i - 1 ][ 1 ] );
                    mergeCount.add( intLen - i - 2 ) ;                  
                }
                
            }
            if( intLen == 2 ){

                if( intervals[ 0 ][ 1 ] >= intervals[ 1 ][ 0 ]){

                    intervals[ 1 ][ 0 ] = Math.min(intervals[ 1 ][ 0 ] , intervals[ 0 ][ 0 ]);
                    intervals[ 1 ][ 1 ] = Math.max(intervals[ 0 ][ 1 ] , intervals[ 1 ][ 1 ]);
                    mergeCount.add( 0 );                    
                }

            }
            
        }
        
        for (int i = 0; i < intervals.length; i++) {
            System.out.println( intervals[i][0] + " " + intervals[i][1] + " ");
        }

        int[][] result = new int[  intLen - mergeCount.size() ][2];
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            

            if( mergeCount.indexOf(i) == -1 ){

                result[count][0] = intervals[i][0];
                result[count][1] = intervals[i][1];
                count++;

            }


        }
        
        return result;

    }

    public static void main(String[] args) {

        // int[][] arr = { {1,3},{2,6},{8,10},{15,18} };
        // int[][] arr = { {1,4},{2,3} };
        int[][] arr = { {1,4},{0,2},{3,5} };

        int[][] result =  merge(arr);

        // for (int i = 0; i < result.length; i++) {
        //     System.out.println( result[i][0] + " " + result[i][1] + " ");
        // }

    }

}
