// https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void extraLongFactorials(int n) {

        // Linear Solution
        /*
         * 
         * BigInteger result = BigInteger.valueOf(1);
         * 
         * for (long i = n; i >= 1; i--) {
         * result = result.multiply( BigInteger.valueOf(i) ) ;
         * }
         * 
         * System.out.println(result);
         */

         System.out.println( fact( BigInteger.valueOf(n)  ) );


    }

    public static BigInteger fact( BigInteger n ){

        if( n.equals( BigInteger.ZERO ) ){
                return BigInteger.ONE;
        }

        return n.multiply( fact( n.subtract( BigInteger.ONE ) ) );


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        extraLongFactorials(n);

        sc.close();

    }

}
