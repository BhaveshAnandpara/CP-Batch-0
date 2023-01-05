import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int tallestCandle = candles.get(0);
        int candleCount = 1;

        for (int i = 1; i < candles.size(); i++) {

            if (candles.get(i) > tallestCandle) {
                tallestCandle = candles.get(i);
                candleCount = 1;
            } else if (candles.get(i) == tallestCandle) {
                candleCount++;
            }

        }

        return candleCount;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println( birthdayCakeCandles(arr) );

        sc.close();
    }

}
