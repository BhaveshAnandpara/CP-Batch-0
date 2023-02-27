package Recursion.Practice;


public class FibonacciNumbers{

    public static int FibonacciNo( int n  ){

        if( n < 2 ) return n;

        return FibonacciNo(n- 1) + FibonacciNo(n- 2);

    }

    public static void main(String[] args) {


        System.out.println(  FibonacciNo(5) );

        
    }

}