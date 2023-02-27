package Recursion.Practice;

public class SumOfDigits {

    public static int sumDigits( int n ){

        if( n <= 0  ) return 0;
        return n%10 + sumDigits(n/10);

    }

    public static void main(String[] args) {

        int n = 8765456; // sum of digits = 1 + 2 + 3 + 4 = 10
        
        System.out.println( sumDigits(n) );

    }
    
}
