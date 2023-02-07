package Sorting;
// https://leetcode.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {


        // Brute Force Approach

        int intLen = intervals.length;

        if (intLen <= 1) // if array size is less than or equals to 1 then return array as it is
            return intervals;

        int temp = 0;
        List<List<Integer>> result = new ArrayList<>();


        // sorts the array using bubble Sort

        for (int i = intLen - 1; i > 0; i--) {

            for (int j = intLen - 1; j > (intLen - 1) - i; j--) {

                if (intervals[j][0] < intervals[j - 1][0]) {

                    temp = intervals[j][0];
                    intervals[j][0] = intervals[j - 1][0];
                    intervals[j - 1][0] = temp;

                    temp = intervals[j][1];
                    intervals[j][1] = intervals[j - 1][1];
                    intervals[j - 1][1] = temp;

                }
            }

        }

        // Checks for the condition and push array to result

        for (int i = 0; i < intLen - 1; i++) {

            if (intervals[i][1] >= intervals[i + 1][0]) { // if [ 0 , 2 ], [ 1 , 3 ] --> if 1 < 2 then Merge

                if (result.size() > 0)
                    result.remove(result.size() - 1);

                //Merging the Items    

                result.add(new ArrayList<>(Arrays.asList(
                        Math.min(intervals[i][0], intervals[i + 1][0]),
                        Math.max(intervals[i][1], intervals[i + 1][1]))));

                intervals[i + 1][0] = Math.min(intervals[i][0], intervals[i + 1][0]);
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);

            } else {

                if (intLen == 2 || i == 0 ) {

                    result.add(new ArrayList<>(Arrays.asList(
                            intervals[i][0],
                            intervals[i][1])));
                    result.add(new ArrayList<>(Arrays.asList(
                            intervals[i + 1][0],
                            intervals[i + 1][1])));
                }

                else {
                    result.add(new ArrayList<>(Arrays.asList(
                            intervals[i + 1][0],
                            intervals[i + 1][1])));
                }

            }

        }



        int[][] resultArr = new int[result.size()][2];

        // Converts Arraylist into 2D Array
        for (int i = 0; i < result.size(); i++) {

            resultArr[i][0] = result.get(i).get(0);
            resultArr[i][1] = result.get(i).get(1);
        }

        return resultArr;

    }

    public static void main(String[] args) {

        // int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] arr = { {1,4},{2,3} };
        // int[][] arr = { {1,4},{0,2},{3,5} };
        // int[][] arr = { {1,3} };
        // int[][] arr = { { 1, 4 }, { 5, 6 } };
        // int[][] arr = { {4,5},{2,4},{4,6},{3,4},{0,0},{1,1},{3,5},{2,2} };

        int[][] result = merge(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1] + " ");
        }

    }

}
