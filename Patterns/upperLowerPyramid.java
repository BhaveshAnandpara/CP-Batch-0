package Patterns;

import java.util.*;

/* 
     * * * * * 
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/

public class upperLowerPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid = ");
        int height = sc.nextInt();

        int row = height * 2;
        int starCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < row; i++) {

            if (i < height) {
                starCount = height - i;
                spaceCount = i;
            } else {
                starCount = (i % height) + 1;
                spaceCount = height - starCount;
            }

            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < starCount; k++) {
                System.out.print(" *");
            }

            System.out.println();

        }

        sc.close();

    }

}
