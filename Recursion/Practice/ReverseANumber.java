package Recursion.Practice;



public class ReverseANumber {


    public static void main(String[] args) {

        int n = 1234;

        System.out.println( reverse(n) );

        
    }

    public static int reverse( int  n ){

        int len = (int) Math.log10(n)  + 1; // Gives Length of Digit
        if( len < 1 )  return 0; 
    
        return (n%10)*(int)Math.pow(10, len - 1) + reverse( n/10 ); // for 1234 --> 4*( 10^3 ) + Reverse( 123 )
    
    }
        
}


