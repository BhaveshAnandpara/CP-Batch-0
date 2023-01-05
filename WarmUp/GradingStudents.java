// https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) < 38) {
                result.add(grades.get(i));
            } 
            
            // grades.get(i) % 5 will give remainder for previous multiple of 5 which then subtracting from 5 gives difference from upcoming 5 multiple

            else if ( 5 -(  grades.get(i) % 5 ) < 3 ) { 
                result.add(grades.get(i) + 5 - grades.get(i) % 5);
            } 

            else {
                result.add(grades.get(i));
            }
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(arr.toString());

        System.out.println(gradingStudents(arr).toString());

        sc.close();

    }

}
