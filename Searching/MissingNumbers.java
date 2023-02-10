package Searching;
// https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true

import java.util.*;

public class MissingNumbers {

    public static List<Integer> result = new ArrayList<>(); // Public List to access in both functions

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        for (int num : brr) {
            arr = search(arr, num);
        }

        Collections.sort(result);
        System.out.println(result);
        return result;

    }

    public static List<Integer> search(List<Integer> arr, int target) {

        for (int i = 0; i < arr.size(); i++) {

            // Check if target is exists ; if exists then replace it to -1;
            if (target == arr.get(i)) {
                arr.set(i, -1);
                return arr;
            }

        }

        // If target is not in arr but is in result ( to avoid duplicate )
        for (Integer num : result) {
            if( target == num ){
                return arr;
            }
        }

        result.add(target);
        return arr;

    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(
                Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));

        missingNumbers(arr, brr);

    }

}
