package Strings;
// https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {

    public static int romanToInt(String s) {
     
    int[] map = new int[26];
    map['A' - 'A'] = 0;
    map['I' - 'A' ] = 1;
    map['V' - 'A' ] = 5;
    map['X' - 'A' ] = 10;
    map['L' - 'A' ] = 50;
    map['C' - 'A' ] = 100;
    map['D' - 'A' ] = 500;
    map['M' - 'A' ] = 1000;
        

    // IV --> 5 - 1 , VI --> 5 + 1
    char prevChar = s.charAt(0); //storing prev Char
    int result = 0;
    

    for (int i = 1; i < s.length(); i++) {
        
        // chcking if prev Char is smaller than current means ( IV ) case occurs so minus and add it to result
        // else just add it to the result
        if(  map[s.charAt(i) - 'A'] > map[prevChar - 'A' ]  ) { 
            result += ( map[ s.charAt(i) - 'A' ] -map[ prevChar - 'A' ] ) ;

            if( i + 1 < s.length() ){
                prevChar = s.charAt(i + 1);
            }else{
                prevChar = 'A';
            }
            i++;
        }

        else{

            result += map[ prevChar - 'A' ]; 
            prevChar = s.charAt(i);

        }

    }

    result += map[ prevChar - 'A' ];

    return result ;

    }

    public static void main(String[] args) {

        String s = "III";

        System.out.println(romanToInt(s));

    }

}
