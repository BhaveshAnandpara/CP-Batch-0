import java.util.Scanner;

// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {

        int greatestLen = s.length() > t.length() ? s.length() : t.length();
        int secLen = s.length() < t.length() ? s.length() : t.length();

        if ((greatestLen + secLen) <= k) {
            return "Yes";

        } else {

            for (int i = 0; i < secLen; i++) {

                if (!(s.charAt(i) == t.charAt(i))) {
                    
                    k -= s.length() - i;

                    if (k >= t.length() - i) {
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
            }

            return ( Math.abs(k - (greatestLen - secLen)) %2 == 0 ) ? "Yes" : "No";

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(appendAndDelete(s, t, k));

        sc.close();

    }

}
