// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {

        int result = 0;

        for (int l = i; l <= j; l++) {

            int revDate = NoReverse(l);

            // System.out.println(l + " - " + revDate + " = " + Math.abs(i - revDate)%k);
            if ((Math.abs(l - revDate) % k) == 0) {
                result++;
            }
        }

        return result;

    }

    public static int NoReverse(int date) {

        StringBuilder s = new StringBuilder(String.valueOf(date));
        s.reverse(); // O(N) time Complexity

        return Integer.parseInt(s + "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sd = sc.nextInt();
        int ed = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(beautifulDays(sd, ed, k));

        sc.close();

    }

}
