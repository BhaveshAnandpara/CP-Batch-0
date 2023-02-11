
package Searching;
// https://leetcode.com/problems/search-a-2d-matrix/

import java.util.*;

public class SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length - 1;
        int mid = end / 2;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (target == matrix[mid][0])
                return true;

            if (target < matrix[mid][0]) {

                end = mid - 1;

            } else if (target > matrix[mid][0]) {

                start = mid + 1;

            }

        }

        mid = (start + end) / 2;

        return search(matrix[mid], target);

    }

    public static boolean search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = end / 2;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[mid] < target)
                start = mid + 1;
            else {
                end = mid - 1;
            }

        }

        return false;

    }

    public static void main(String[] args) {

        int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        System.out.println(searchMatrix(nums, 7));

    }

}
