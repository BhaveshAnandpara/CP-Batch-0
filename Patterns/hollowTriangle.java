package Patterns;
import java.util.Scanner;

/*
 

     *
    * *
   *   *
  *     *
 *********
 
 */

public class hollowTriangle {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Triangle = ");
        int row = sc.nextInt();

        int center = ( row * 2 - 1 )/2; // Center of Triangle

        for (int i = 0; i < row - 1; i++) {

            for (int j = 0; j <= center + i ; j++) {
                
                if( j == center - i  ) System.out.print( "*");
                else if( j == center + i  ) System.out.print( "*");
                else System.out.print( " ");

            }

            System.out.println();
            
        }

        for (int i = 0; i < row*2 - 1; i++) {
            System.out.print("*");
        }

        sc.close();
        
    }

}
