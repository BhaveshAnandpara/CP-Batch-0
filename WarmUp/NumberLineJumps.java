import java.util.Scanner;

// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // Original Solution -> Complexity -> > O(1)
        /*
         * if ((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2)) //If a kangaroo is ahead in
         * distance and takes long jumps then another kangaroo can never reach the point
         * return "NO";
         * else if (x2 == x1 && v2 == v1) // If both are starting at same point and
         * jumping at same distance then on next jump thay will be together
         * return "YES";
         * else {
         * while (v1 > v2 ? !(x1 > x2) : !(x2 > x1)) { // IF v1 > v2 then we need to
         * check if x1 > x2 because if again a kangaroo get ahead in distance with
         * longer jumps another will never catch upon
         * 
         * if (x1 == x2)
         * return "YES";
         * x1 = x1 + v1;
         * x2 = x2 + v2;
         * }
         * return "NO";
         * }
         */
        // Better Solution -> O(1)

        // We know Speed = Distance / Time -> Speed = Distance / Jumps
        // therefore , Distance => Speed * Jumps -> v1 * jumps
        // Total Distance ( kangaroo 1 ) = ( v1 * j ) + x1
        // Total Distance ( kangaroo 2 ) = ( v2 * j ) + x2

        // Now if TD ( k1 ) == TD ( k2 ) for some j they will meet -> ( v1 * j ) + x1 = ( v2 * j ) + x2
        // x2 - x1 = ( v1 * j ) - ( v2 * j ) --> x2 - x1 = ( v1 - v2 ) * j -----> ( as x2 > x1 given in condition )

        // therefore j = ( x2 - x1 ) / ( v1 - v2 ) so for some j jumps they will meet
        // Now Jumps cannot be in decimals hence
        // j = ( x2 - x1 ) % ( v1 - v2 ) == 0

        // ( ((x2 - x1) % (v1 - v2)) != 0 ) ? return "NO" : return "YES";


        if(v1 > v2 && (x2-x1) % (v1-v2) == 0) return "YES"; // if v2 > v1 and as x2 > x1 always kangaroo will never meet
        return "NO";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));

        sc.close();

    }

}
