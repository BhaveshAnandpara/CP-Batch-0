import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        // Original Solution
        /*
         * 
         * int result = 0;
         * 
         * for (int i = 0; i < ar.size(); i++) {
         * 
         * for (int j = i + 1; j < ar.size(); j++) {
         * 
         * if ((ar.get(i) + ar.get(j)) % k == 0) {
         * result++;
         * }
         * ;
         * }
         * }
         * 
         * return result;
         */

        // Optimized Solution
        int result = 0;

        List<Integer> newArr = new ArrayList<>(k);

        for (int i = 0; i < k; i++) {
            newArr.add(0);
        }
        
        for (int i = 0; i < ar.size(); i++) {
            newArr.set( ar.get(i) , newArr.get(ar.get(i)) + 1 );
        }

        
        result += (newArr.get(0) * (newArr.get(0) - 1)) / 2;

        for (int i = 1; newArr.size() - i >= i; i++) {

            if (newArr.size() - i == i) {
                result += newArr.get(i);
                return result;
            }
            result += newArr.get(newArr.size() - i) * newArr.get(i);

        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> ar = new ArrayList<>();

        // Original
        // for (int i = 0; i < n; i++) {
        // ar.add(sc.nextInt());
        // }

        // Optimized
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt() % k);
        }

        System.out.println(divisibleSumPairs(n, k, ar));

        sc.close();

    }

}
