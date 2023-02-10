package Searching;
// https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        int peak = 0;
        int peakEle = nums[0];

        if (nums.length <= 2) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > peakEle) {
                    peak = i;
                    peakEle = nums[i];
                }
            }

            return peak;

        }
        return peak(nums, 0, nums.length - 1);

    }

    public static int peak(int[] nums, int startIndex, int lastIndex) {

        int mid = startIndex + (lastIndex - startIndex) / 2;

        if( lastIndex - startIndex == 1 ){

            return nums[startIndex] > nums[lastIndex] ? startIndex : lastIndex ;

        }

        if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return mid;
        }

        int leftPeak = peak(nums, startIndex, mid);
        int rightPeak = peak(nums, mid, lastIndex);



         return nums[leftPeak] > nums[rightPeak] ? leftPeak : rightPeak ;

    }

    public static void main(String[] args) {

        // int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        int[] nums = { 1,2,3,1 };
        // int[] nums = { 1, 2, 3 };
        // int[] nums = { 3,2,1 };

        System.out.println(findPeakElement(nums));

    }

}
