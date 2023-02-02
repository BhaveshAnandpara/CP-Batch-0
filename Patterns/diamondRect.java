package Patterns;

import java.util.Scanner;

/*
 
      0 ---> 0  **********
      1 ---> 2  ****  ****
      2 ---> 4  ***    ***
      3 ---> 6  **      **
      4 ---> 8  *        *
      5 ---> 8  *        *
      6 ---> 6  **      **
      7 ---> 4  ***    ***
      8 ---> 2  ****  ****
      9 ---> 0  **********


 */

public class diamondRect {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Rect = ");
        int height = sc.nextInt();
        int row = 0 ;
        int center = 0;
        int spaceCount = 0;

        //for this rect must be of even rows
        //rows = cols
        if( (height & 1) == 0 ) row = height;
        else row = height + 1;

        center = row/2;

        for (int i = 0; i < row; i++) {

            if( i < center )  spaceCount = i*2;
            if( i == center) spaceCount = (i-1)*2;
            if( i > center )  spaceCount = ( (center - 1 ) * 2)  - ( (i%center) * 2 ) ;

            for (int j = 0; j < row; j++) {

                // for row 2 --> spaces = 4 so stars will be 6,now spaces is between so there will be 3 stars to right and left 
                // hence for row 2 ---> 3 stars + 4 space + 3 stars
                
                if( j < (row - spaceCount) / 2 ) System.out.print("*"); 
                else if( j >= (row - spaceCount) / 2 && j < ((row - spaceCount) / 2) + spaceCount ) System.out.print(" ");
                else System.out.print("*");

            }

            System.out.println();

        }


        sc.close();

    }
    
}
