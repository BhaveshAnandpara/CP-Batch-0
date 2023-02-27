package Recursion.Practice;

public class PalindromeNumber {

    static boolean palindromeNumber( int n ){

        if( n == ReverseANumber.reverse(n) ){
            return true;
        }
        else return false;

    }

    public static void main(String[] args) {


        int n = 12321;


        System.out.println( palindromeNumber(n) );
        
    }
    
}
