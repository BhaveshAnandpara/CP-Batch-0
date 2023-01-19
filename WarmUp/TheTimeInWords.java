import java.util.Scanner;

// https://www.hackerrank.com/challenges/the-time-in-words/problem?isFullScreen=true

public class TheTimeInWords {

    public static String timeInWords(int h, int m) {

        String time[] = { "o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty" };
        StringBuilder tense = new StringBuilder("");

        if (m > 30) {
            h++;
            m = 60 - m;
            tense.append(" to ");
        } else {
            tense.append(" past ");
        }

        // 5:00
        if (m == 0)
            return "" + time[h] + " o' clock";

        // 5:01
        if (m == 1)
            return "" + time[m] + " minute" + tense + time[h];

        // 5:15
        if (m == 15)
            return "" + time[m] + tense + time[h];

        // 5:30
        if (m == 30)
            return "half past " + time[h];

        // 5:10
        if (m <= 20)
            return "" + time[m] + " minutes" + tense + time[h];

        // 5:28
        if (m > 20)
            return "" + time[(m / 10) * 10] + " " + time[m % 10] + " minutes" + tense + time[h];

        return " Error ";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int min = sc.nextInt();

        System.out.println(timeInWords(hr, min));

        sc.close();

    }

}
