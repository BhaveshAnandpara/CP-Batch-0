package Strings;
// https://leetcode.com/problems/sort-characters-by-frequency/

import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {

        /*
         * Approach 1 ---> Without Map ( really bad complexity )
         *  
        ArrayList<ArrayList<Character>> result = new ArrayList<>(s.length());
        StringBuilder resultStr = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            // System.out.println(result);

            if (result.size() == 0)
                result.add(new ArrayList<>(Arrays.asList(s.charAt(i)))); // for very first char

            else {

                int len = result.size() - 1; 

                while (len >= 0) {

                    int index = (result.get(len)).indexOf(s.charAt(i)); // if char exist promote it to next array else add it to current array

                    if (index != -1) {

                        if (len + 1 == result.size()) { // if it is in highest freq array add new array

                            result.add(new ArrayList<>(Arrays.asList(s.charAt(i))));

                        } else {

                            result.get(len + 1).add(s.charAt(i));

                        }

                        result.get(len).remove(index); //if item is promoted then remove item from current array
                        len = 0; // to break the array
                    }

                    else if( len == 0 ) {

                        result.get(len).add(s.charAt(i)); // if element is new then add it to very first array
                        
                    }
                    
                    len--;
                }

            }

        }

        System.out.println( result );

        for (int i = result.size() - 1; i >= 0  ; i--) {
            
            for ( Character ch : result.get(i) ) {
                
                for (int j = 0; j <= i; j++) {
                    
                    resultStr.append( ch );

                }

            }

        }

        return  resultStr.toString() ;
         */


        //Approach 2 using Maps

        int[] map = new int[80];
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) { //map the freq of all char
            
            map[ s.charAt(i) - '0' ]++;

        }

        int max = 0;
        int index = 0;
        int maxCount = s.length(); 

        while( maxCount > 0  ){ //maxcount to avoid iterating 80 times 
            
            for (int i = 0; i < map.length; i++) {  // find index of highest freq
                
                if( map[ i ] > max ){
                    
                    max = map[i];
                    index = i;
                    
                }
                
            }

            for (int i = 0 ; i < map[index]; i++) {
                
                result.append( (char)('0' + index) ); //print ch times freq

            }
            
            map[index] = -1; 
            max = 0;
            maxCount --;

        }

        return result.toString();

    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println(frequencySort(s));

    }

}
