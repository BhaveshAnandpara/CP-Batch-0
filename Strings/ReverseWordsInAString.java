package Strings;
// https://leetcode.com/problems/reverse-words-in-a-string/


public class ReverseWordsInAString {

    public static String reverseWords(String s) {

        String[] arr = s.trim().split(" "); // will trim trailing commas at end and split into words 
        StringBuilder result = new StringBuilder("");

        result.append(arr[arr.length - 1]); 

        for (int i = arr.length - 2 ; i >= 0; i--) {

            if( !(arr[i].equals("")) ) result.append(" " + arr[i]); 

        }

        return result.toString();
        
    }

    public static void main(String[] args) {


        String s = "  hello world  ";

        System.out.println( reverseWords(s) );
   

    }
    
}
