package Sorting;
import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/

public class MinimumNumberOfMovesToSeatEveryone {

    static public int minMovesToSeat(int[] seats, int[] students) {

        int moves = 0;

        // Sort Using Insertion Sort O( n^2 )

        /*
         * for (int i = 0; i < students.length - 1; i++) {
         * 
         * if (seats[i] > seats[i+1]) {
         * 
         * for (int j = i + 1 ; j > 0; j--) {
         * 
         * if( seats[j] < seats[j - 1] ){
         * 
         * int temp = seats[j];
         * seats[j] = seats[j-1];
         * seats[j - 1] = temp;
         * }
         * else break;
         * 
         * }
         * 
         * }
         * 
         * if (students[i] > students[i+1]) {
         * 
         * for (int j = i + 1 ; j > 0; j--) {
         * 
         * if( students[j] < students[j - 1] ){
         * int temp = students[j];
         * students[j] = students[j-1];
         * students[j - 1] = temp;
         * }
         * else break;
         * 
         * }
         * 
         * }
         * 
         * }
         */

        // Sort using inbuilt function O( nlog(n) )

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {

            moves += Math.abs(seats[i] - students[i]);

        }

        return moves;

    }

    public static void main(String[] args) {

        int[] seats = { 4, 1, 5, 9 };
        int[] students = { 1, 3, 2, 6 };

        System.out.println(minMovesToSeat(seats, students));

    }

}
