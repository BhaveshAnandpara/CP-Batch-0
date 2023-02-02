package Patterns;

import java.util.Scanner;

/*
 
    *****
   *   *
  *   *
 *   *
*****

*/

public class slantedRect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Rect = ");
        int row = sc.nextInt();
        int spaceCount = row;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < spaceCount + row ; j++) {
                
                if( j < spaceCount ) System.out.print(" "); // print space first

                if( (i == 0 || i == row - 1) && j >= spaceCount) System.out.print("*");
                else if( j == spaceCount || j == row + spaceCount - 1) System.out.print("*");
                else System.out.print(" ");

            }

            spaceCount --;
            System.out.println();

        }



        sc.close();
        
    }
    
}
