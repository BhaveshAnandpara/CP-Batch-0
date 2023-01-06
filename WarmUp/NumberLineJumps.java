import java.util.Scanner;

// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        
        if(( x2 > x1 && v2 > v1 ) || ( x1 > x2 && v1 > v2 ) ) return "NO" ;
        else if( x2 == x1 && v2 == v1 ) return "YES";
        else
        {
            while( v1 > v2 ? !(x1 > x2) : !(x2 > x1)  ){
                System.out.println( "" + x1  +  x2 );
                if( x1 == x2 ) return "YES";
                x1 = x1 + v1;
                x2 = x2 + v2;
            }
            return "NO";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println( kangaroo(x1, v1, x2, v2) );

        sc.close();

    }

}
