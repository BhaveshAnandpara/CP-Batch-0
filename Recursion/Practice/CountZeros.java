package Recursion.Practice;

public class CountZeros {

    
    static int countZeros( int n ){
        
        if( n == 0  ) return 0 ;

        if( n%10 == 0  ) return 1 + countZeros(n/10); 
        return 0 + countZeros(n/10);


    }

    public static void main(String[] args) {

        int n = 10002450;
        System.out.println( countZeros(n) );
        
    }
    
}
