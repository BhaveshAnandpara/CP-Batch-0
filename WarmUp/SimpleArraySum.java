package WarmUp;
// https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }

            else if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            }

        }

        return result;

    }

}

class SimpleArraySum {

    public static void main(String[] args) {

            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 2; i++) {
                
                for( int j = 0 ; j < 3 ; j++ ){
                    
                    if( i == 0  ) a.add(sc.nextInt());
                    if( i == 1  ) b.add(sc.nextInt());

                }
                
            }

            System.out.println( Result.compareTriplets(a, b) );


            sc.close();

    }

}