package Recursion.Questions;
// https://leetcode.com/problems/generate-parentheses/

import java.util.*;

public class GenerateParentheses {

    static List<String> result = new ArrayList<String>();

    
    // <cmg "ImageNotes\GenerateParantesis.jpg">
    public static List<String> generateParenthesis(int n) {

        generateResult("", n);
        return result;

    }


    public static void generateResult(String p, int n) {

        int countOfCloseB = 0;
        int pLen = p.length();

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

    public static void main(String[] args) {
   
        int n = 3;
        System.out.println(generateParenthesis(n));

    }

}