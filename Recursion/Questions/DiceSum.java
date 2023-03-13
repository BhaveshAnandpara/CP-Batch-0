package Recursion.Questions;

import java.util.*;

//* Amazon Que */

//find the no of ways to get target by rolling dice by n times
//target = 4 --> 4,13,31,121,112,211,1111

public class DiceSum {

    static List<String> result = new ArrayList<>();

    public static void findRolls( String p , int target ){

        if( target == 0 ){
            result.add(p);
            return;
        }

        int[] faces = {1,2,3,4,5,6};

        for (int num : faces) {
            
            if( num <= target ){

                findRolls( p+num  , target-num );

            }

        }




    }

    public static void main(String[] args) {
    
        int target = 6;

        findRolls("", target);
        System.out.println( result );

    }
    
}
