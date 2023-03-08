package Recursion.Questions;
// https://leetcode.com/problems/generate-parentheses/

import java.util.*;

public class GenerateParentheses {

    static List<String> result = new ArrayList<String>();

    
    // <cmg "ImageNotes\GenerateParantesis.jpg">
    public static List<String> generateParenthesis(int n) {

        // generateResult("", n);
        generateResult("", 0 , 0 , n);
        return result;

    }

    /*
     * // Correct Approach but could have been better
    public static void generateResult(String p, int n) {

        int countOfCloseB = 0;
        int pLen = p.length( );

        if (n == 0) {
            result.add(p);
            return;
        }

        // count ')'
        for (int i = 0; i < pLen; i++) {

            if (p.charAt(i) == ')')
                countOfCloseB++;

        }

        // * If( count of couple bracket ) < n that means we can add '('
        if ((pLen - countOfCloseB) - countOfCloseB < n) {

            generateResult(p + '(', n);
        }

        // * If( count of couple bracket ) != "" checking for this condition then you can add ')'
        if ((pLen - countOfCloseB) - countOfCloseB != 0) {
            p += ')';
            generateResult(p, n - 1);
        }

    }
     */


     //Easy Approach
     public static void generateResult(String p , int close , int open  , int n ){

        if( p.length() == n*2 ) {
            result.add(p);
            return;
        }

        // Add '(' if there is still space for brackets
        if( open < n  ){
            generateResult( p+'(' , close, open + 1, n);
        }

        //Only add ')' if '(' count is more
        if( close < open ){
            generateResult( p+')' , close + 1, open, n);
        }

     }

    public static void main(String[] args) {
   
        int n = 3;
        System.out.println(generateParenthesis(n));

    }

}