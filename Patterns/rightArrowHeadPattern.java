package Patterns;

import java.util.*;

/*
 
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
 */

public class rightArrowHeadPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Col = ");
        int col = sc.nextInt();

        int totalCol = 0;

        for (int i = 1; i <= col * 2 - 1; i++) {

            if (i > col) {
                totalCol = col - i % col; // if col exceeds no. of given columns it descreses
            } else {
                totalCol = i;
            }

            for (int j = 0; j < totalCol; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        sc.close();

    }

}
