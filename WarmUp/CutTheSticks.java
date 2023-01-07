// https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();

        result.add(arr.size());

        while (true) {

            int smallest = arr.get(0);

            for (int i = 1; i < arr.size(); i++) {

                if (arr.get(i) <= smallest) {
                    smallest = arr.get(i);
                }

            }

            for (int i = 0; i < arr.size(); i++) {

                if (arr.get(i) == smallest) {
                    arr.remove(i);
                    i--;
                }

            }

            if (arr.size() == 0)
                return result;
            result.add(arr.size());
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(cutTheSticks(arr));

        sc.close();

    }

}
