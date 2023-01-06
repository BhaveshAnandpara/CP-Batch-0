import java.util.Scanner;

// https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true

public class DrawingBook {

    public static int pageCount(int n, int p) {

        if ((p / 2) == ((n - (p - p % 2)) / 2)) {
            return p / 2;
        } else if ((p / 2) > ((n - (p - p % 2)) / 2)) {

            return ((n - (p - p % 2)) / 2);
        } else {
            return p / 2;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(pageCount(n, p));

        sc.close();

    }

}
