package Recursion.Questions;
// https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {

    /*
     * 
     * // Recursive Approach
     * 
     * public static boolean isPalindrome(String s) {
     * 
     * StringBuilder palindrome = new StringBuilder("");
     * 
     * for (int i = 0; i < s.length(); i++) {
     * 
     * if( Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) )
     * palindrome.append( Character.toLowerCase( s.charAt(i) ) );
     * }
     * 
     * if( reverse(palindrome) ) return true;
     * else return false;
     * 
     * 
     * }
     * 
     * static boolean reverse( StringBuilder s ){
     * 
     * if( s.length() < 2 ) return true;
     * 
     * if( s.charAt(0) == s.charAt(s.length() - 1 ) ) return reverse( new
     * StringBuilder( s.substring(1 , s.length() - 1 ) ) );
     * else return false;
     * 
     * 
     * }
     * 
     */

    public static boolean isPalindrome( String s ){

        StringBuilder palindrome = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);

            if( Character.isLetterOrDigit(ch) )
            palindrome.append( Character.toLowerCase(ch) );

        }

        System.out.println(  );

        if( (palindrome.toString()).equals(palindrome.reverse().toString()) ) return true;
        else return false;

    }

    public static void main(String[] args) {

        String s = "race a car";

        System.out.println(isPalindrome(s));

    }

}
