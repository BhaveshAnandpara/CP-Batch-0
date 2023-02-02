package Patterns;

import java.util.Scanner;

/*


 
    ( row ) 0 --> 4 ( iterations of j )        *                                          
    ( row ) 1 --> 5 ( iterations of j )       * *
    ( row ) 2 --> 6 ( iterations of j )      *   *
    ( row ) 3 --> 7 ( iterations of j )     *     *
    ( row ) 4 --> 8 ( iterations of j )    *       *
    ( row ) 5 --> 7 ( iterations of j )     *     *
    ( row ) 6 --> 6 ( iterations of j )      *   *
    ( row ) 7 --> 5 ( iterations of j )       * *
    ( row ) 8 --> 4 ( iterations of j )        *
         
 */

public class hollowDiamond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height pf Diamond ( > 3 ) = ");
        int height = sc.nextInt(); // 9
        int row = 0;
        int col = 0;
        int starDist = 0; // Distance from Center

        // Diamond cannot be of even rows
        if ((height & 1) == 0)
            row = height + 1;
        else
            row = height; // 9

        // center column of diamond
        int center = row / 2; // 4


        for (int i = 0; i < row; i++) {

            if (i <= center) {
                col = center + i;
                starDist = i; 
            } 
            else if (i == center * 2) {
                col = center;
                starDist = 0;
            }
            else {
                col = (center * 2) - (i % center);  
                starDist = center - (i % center);
            }


            for (int j = 0; j <= col; j++) {

                if (j != center - starDist && j != center + starDist)
                System.out.print(" ");
                else
                System.out.print("*");

            }

            System.out.println();

        }

        sc.close();

    }

}
