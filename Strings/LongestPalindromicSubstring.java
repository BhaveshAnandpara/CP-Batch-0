package Strings;
// https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        // brute Force Approach

        
         
         StringBuilder result = new StringBuilder("");
         int start, end;
         
         int palindromeEnd = 0;
         
         for (int i = 0; i < s.length(); i++) {
         
         start = i;
         palindromeEnd = s.length() - 1;
         end = palindromeEnd;
         
         while (start <= end) {
         
         if (palindromeEnd - i < result.length()) // if substring is less than result
         break;
         
         if (s.charAt(start) == s.charAt(end)) {
         
         start++;
         end--;
         
         } else {
         palindromeEnd--;
         start = i;
         end = palindromeEnd;
         }
         
         }
         
         if (s.substring(i, palindromeEnd + 1).length() > result.length())
         result = new StringBuilder(s.substring(i, palindromeEnd + 1));
         
         }
         
         return result.toString();
        



    }

    public static void main(String[] args) {

        String s = "xaabacxcabaaxcabaax";
        // String s = "asb";
        // String s = "babad";

        System.out.println(longestPalindrome(s));

    }

}
