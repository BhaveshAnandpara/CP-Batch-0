package Recursion.Questions;
// https://leetcode.com/problems/count-good-numbers/

public class CountGoodNumbers {

    static int p = 1000000007; // Need to take mod with this value
    // e.g 12345634567 * 1234567890 = will give value so large cannot save it in int
    // so description is asking for ans % ( 10^9 + 7 ) = which will not be the exact ans but can be used to reach the ans

    //Modulo Arithmetics 
    // ( a * b ) = ( ( a % p ) * ( b % p ) ) % p
    // ( a + b ) = ( ( a % p ) + ( b % p ) ) % p


    // first *5 then *4 until n becomes 0 ---> ( 5*4*5*4*5*4*5*4*5*4*5*4*.... )
    public static int countGoodNumbers(long n) {

        long count_of_4 = n/2;  // find how many times you need * 4
        long count_of_5 =  n - count_of_4; // find how many times you need * 4

        return (int)( ((power( 4 , count_of_4 ) % p)  * (power( 5 , count_of_5 ) % p ) ) % p ) ;
        // for n = 10 
        // return ( 4^5 ) * ( 5^5 ) ---> ( ( ( 4^5 ) % p )* ( ( 5^5 ) % p ) ) % p 

    }

    public static long power( long x , long y  ){

        // 4 ^ 5 =     res = 4 , x = 4^2 
        // 4 ^ 2 =     res = 4 , x = 4^4 
        // 4 ^ 1 =     res = 4 * 4^4 , x = 4^8 

        if( y == 0 ) return 1;
        
        long res = 1;

        while( y > 0  ){

            // if power is odd add the x value 
            if( (y&1) == 1 ) {
                res = (res * x)  % p;
            }

            //increase power of x everytime
            x = (x*x) % p;
            // divide n by 2
            y = y/2;

        }

        return res;

    }

    public static void main(String[] args) {

        long n = 50;

        System.out.println( countGoodNumbers(n));
        
    }

    
}
