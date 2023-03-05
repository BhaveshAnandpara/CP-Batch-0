package Recursion.Questions;
// https://leetcode.com/problems/powx-n/

public class PowXN {

    public static double myPow(double x, int n) {

        if (n == 0)
            return 1;

        double result = 1;
        long absN = n;

        boolean isNeg = false;

        if (n < 0) {

            isNeg = true;

            if (Integer.MIN_VALUE == n) // for -2147483648 Math.abs() doesnot work so
                absN = Long.MAX_VALUE % n + 1; // gives 2147483648
            else
                absN = Math.abs(n); // Take Absolute value if neagtive e.g ==> 2^( -2 ) ==> 1 / 2^2

        }

        // <cmg "ImageNotes\PowXN.jpg">

        while (absN > 0) {

            if ((absN & 1) == 1) // If bit is '1' add the value to result --> 2^2 * 2^8
                result *= x;

            x *= x; // calculate the value until bit is not '1'
            absN >>>= 1 ; // basically --> n = n/2 --> 1 0 1 0 <-- right shifting 

        }

        if (isNeg)
            return 1 / result;
        return result;

    }

    public static void main(String[] args) {

        double x = 2.0000;
        int n = 10;

        System.out.println(myPow(x, n));

    }

}
