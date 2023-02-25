package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        if( matrix[0].length <= 1 ) { //If Array has only 1 elment cannot create Spiral so return as it is

            for (int i = 0; i < matrix.length; i++) {
                res.add( matrix[i][0] );
            }

            return res;
        }

        int start = 0, i = 0;
        int end = matrix.length - 1;
        boolean right = true;

        while (start <= end) {

            if( i == start && right  ){ //if i == start and right == true means we need to add whole array

                int val  =  ( start - 1 ) < 0 ? 0 : start - 1; // for handling -1 
                
                for ( int j = val ; j <= (matrix[i].length - 1 - start) ; j++) {
                    
                    res.add( matrix[i][j] );
                    
                }
                start++; 
                right = false; // right = false means from now on we will take last element of next array ( Not whole Array )
                i++;

            }
            
            else if( i == end && !right ){ // if i == end and right == false means we are at bottom and need to add whole array in reverse order

                for (int j = matrix[i].length - ( matrix.length - end )  ; j >= start - 1 ; j--) {

                    res.add( matrix[i][j] );
                    
                }
                end--;
                right = true; // right = true means from now on we will take first element of next array ( Not whole Array )
                i--;

            }
            else{

                if( right ){ // now it means we do not need whole array just first element
                    res.add( matrix[i][ start - 1 ] );
                    i--;
                }
                else{// now it means we do not need whole array just last element
                    res.add( matrix[i][ ( matrix[i].length - 1 ) - ( start - 1 ) ] );
                    i++;
                }

            }

            if( start + ( matrix.length - 1 - end) > matrix[0].length ) break; 

        }

        return res;

    }

    public static void main(String[] args) {

        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
        // int[][] matrix = { {1,2,3,4},{5,6,7,8},{9,10,11,12} };  
        // int[][] matrix = { {1},{2},{3},{4},{5},{6},{7},{8},{9},{10} };  
        int[][] matrix = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };  
        // int[][] matrix = { {1,11},{2,12},{3,13},{4,14},{5,15},{6,16},{7,17},{8,18},{9,19},{10,20} };  

        System.out.println(spiralOrder(matrix));

    }
}