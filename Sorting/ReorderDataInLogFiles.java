package Sorting;
// https://leetcode.com/problems/reorder-data-in-log-files/

import java.util.*;

public class ReorderDataInLogFiles {

    public static String[] reorderLogFiles(String[] logs) {

        List<String> letterLogs = new ArrayList<>();
        List<String> digitalLogs = new ArrayList<>();

        // Divide LetterLogs and DigitalLogs
        for (String string : logs) {

            /*
             * //Aproach 1 Check for 1st element after first " "
             * for (int i = 0; i < string.length(); i++) {
             * 
             * 
             * if( string.charAt(i) == ' ' && string.charAt(i + 1) >= 'a'){
             * letterLogs.add(string);
             * break;
             * }
             * 
             * if( string.charAt(i) == ' ' && string.charAt(i + 1) >= '0'){
             * digitalLogs.add(string);
             * break;
             * }
             * 
             * }
             * 
             */

            // Approach 2

            if (Character.isDigit(string.charAt(string.length() - 1))) {
                digitalLogs.add(string);
            } else {
                letterLogs.add(string);
            }

        }

        String[] sortedLetters = letterLogs.toArray(new String[letterLogs.size()]); // ArrayList to Array
        String[] result = new String[logs.length];

        // Compare String after first " " and if same compare identifier/ before first "
        // "

        /**
         * 
         * //Approach 1
         * Arrays.sort(sortedLetters,
         * (a, b) -> ((String) a).substring(((String) a).indexOf(" ") + 1)
         * .compareTo(((String) b).substring(((String) b).indexOf(" ") + 1)) == 0
         * ? ((String) a).substring(0, ((String) a).indexOf(" "))
         * .compareTo(((String) b).substring(0, ((String) b).indexOf(" ")))
         * : ((String) a).substring(((String) a).indexOf(" ") + 1)
         * .compareTo(((String) b).substring(((String) b).indexOf(" ") + 1)));
         * 
         */

        //Approach 2 ( Using Comparator )
        Arrays.sort( sortedLetters , new Comparator<String>() {
            
            public int compare( String a  , String b ){

                String s1 = a.substring(a.indexOf(" ") + 1);
			    String s2 = b.substring(b.indexOf(" ") + 1);

                return s1.equals(s2) ? a.compareTo(b) : s1.compareTo(s2); // if strings after " " is equal then compare whole strings

            }

        } );

        // Merge LetterLogs and DigitalLogs
        for (int i = 0; i < result.length; i++) {

            if (i < sortedLetters.length)
                result[i] = sortedLetters[i];

            else {
                result[i] = digitalLogs.get(i - sortedLetters.length);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit
        // dig","let3 art zero"};
        // String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8
        // act zoo"};
        // String[] logs = {"1 n u", "r 527", "j 893", "6 14", "6 82"};
        String[] logs = { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car" };

        String[] result = reorderLogFiles(logs);

        for (String string : result) {

            System.out.println(string + ",");

        }

    }

}
