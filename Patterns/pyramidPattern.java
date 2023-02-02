package Patterns;
/*

        *
       ***
      *****
     *******
    *********

        4
       345
      23456
     1234567
    012345678
        
 
 */

import java.util.Scanner;

public class pyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid = ");
        int row = sc.nextInt(); // row = 5

        int col = ( row * 2 - 1 ); // col = 9
        int midCol = col/2;

        for (int i = 0; i < row; i++) {
            
            //There are 1 to right and 1 to left to midcol for row = 1;
            //so we need to run j for midCol + no. of row
            // run upto 4 --> row = 0
            // run upto 5 --> row = 1
            // run upto 6 --> row = 2

            for (int j = 0; j <= midCol + i ; j++) {  
                
                if( j >= midCol - i ){ // we want to start '*' with middle - no.of col 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

        sc.close();

    }

}
