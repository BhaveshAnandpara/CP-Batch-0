import java.util.Scanner;

// https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true

public class UtopianTree {

    public static int utopianTree(int n) {

        // original solution
        /*
         * 
         * int height = 0;
         * 
         * for (int i = 0; i <= n; i++) {
         * if( i%2 == 0 ){
         * height+=1;
         * }
         * else{
         * height = height*2;
         * }
         * 
         * }
         * 
         * return height;
         */

        // optimized Solution

        // year = cycles / 2 ----> 2 cycles in 1 Year ==> n >> 1 ---> 6 Cycles --> 110 -> 11 --> 3 Years 
        // year 1 (2 cycles) : 1*2+1 = 3 -> 11
        // year 2 (4 cycles) : 3*2+1 = 7 -> 111
        // year 3 (6 cycles) : 7*2+1 = 15 -> 1111
        // year 4 (8 cycles) : 15*2+1 = 31 -> 11111
        // year 5 (10 cycles) : 31*2+1 = 63 -> 111111

        //formula => ( year + 1 ) 0's --> e.g ---> ( 3 + 1 ) year ---> 10000 ( 4 0's) ===>  1 << (year + 1)
        // Now - 1 from Binary no ----> 10000 - 1 ---> 1111 i.e Answer

        //   1 << ( (n >> 1) + 1 ) - 1 ---> Formula for even cycles
        //   ( 1 << ( (n >> 1) + 1 ) - 1 ) << 1 ---> Formula for odd cycles ( << 1 will multiply it by 2 )

        return (( 1<<( (n>>1)+1 ) )-1) << n%2;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(utopianTree(sc.nextInt()));
        }

        sc.close();

    }

}
