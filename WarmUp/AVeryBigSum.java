// https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long result = 0;

        for (int j = 0; j < ar.size(); j++) {
            result += ar.get(j);
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        List<Long> arr = new ArrayList<Long>();

        for (int i = 0; i < len; i++) {

            arr.add(sc.nextLong());

        }

        System.out.println(aVeryBigSum(arr));

        sc.close();
    }

}
