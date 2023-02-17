package Strings;
// https://leetcode.com/problems/rotate-string/


public class RotateString {

    public static  boolean rotateString(String s, String goal) {
        
        if( s.length() != goal.length() ) return false; // for edge cases of string not equal to length

        char pivot = goal.charAt(0); // get the char where the pivot is /// a = "-->abcde" , b = "cde-->ab" --> basically upto "ab" array is pivoted

        int count = 0;

        while( count < goal.length() ){

            if( s.charAt(count) == pivot){  


                // a = "-->abcde" , b = "cde-->ab"
                // pivot ==> c  , before 'c' is "ab" so last two( length of pivoted string ) char 

                if( ( s.substring(0 , count ).equals( goal.substring( (goal.length() - count) , goal.length()) ) )  
                &&  ( s.substring(count , goal.length() ).equals( goal.substring(0 , (goal.length() - count) ) ) )
                ){
        
                    return true;
        
                }

            }
            
            count++;
        }


        return false;

    }

    public static void main(String[] args) {

        String s = "bbbacddceeb";
        String goal = "ceebbbbacdd";

        System.out.println( rotateString(s, goal) );
        
    }
    
}
