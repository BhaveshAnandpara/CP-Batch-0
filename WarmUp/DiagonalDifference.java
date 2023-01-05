// https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int pDiagonal = 0;
        int sDiagonal = 0;

        for( int i = 0 ; i < arr.size() ; i++ ){
            pDiagonal += arr.get(i).get(i);
            sDiagonal += arr.get(i).get(arr.size()-i-1);
        }

        return  Math.abs(pDiagonal - sDiagonal) ;

    }

}


public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
                arr.add(new ArrayList<>());
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println( Result.diagonalDifference(arr) );

        sc.close();

    }

}
