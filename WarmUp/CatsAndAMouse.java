import java.util.Scanner;

// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true

public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        if (Math.abs(z - x) == Math.abs(z - y)) {
            return "Mouse C";
        } else if (Math.abs(z - x) > Math.abs(z - y)) {
            return "Cat B";
        } else {
            return "Cat A";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(catAndMouse(x, y, z));

        }

        sc.close();
        ;

    }
}
