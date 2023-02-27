package Recursion.Questions;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/


public class NumberOfStepsToReduceANumberToZero {

    static int IterativeSol( int n ){

        int count = 0;

        while( n > 0  ){

            if( (n & 1) == 0 ){
                n = n / 2;
            }
            else n--;

            count++;

        }

        return count;

    }


    static int recursiveSol( int n ){

        if( n == 0  ) return 0;

        if( (n & 1) == 0 ) return 1 + recursiveSol( n / 2 );
        else return 1 + recursiveSol( n - 1  );


    }

    public static void main(String[] args) {

        int n = 123;

        System.out.println( recursiveSol(n) );

        
    }
    
}
