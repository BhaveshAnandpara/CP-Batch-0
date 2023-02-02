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
 
 */

import java.util.Scanner;

public class pyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid = ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < row*2-1; j++) {

                if ( j < (row * 2 - 1) / 2) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }


            }

            System.out.println();

        }

        sc.close();

    }

}
