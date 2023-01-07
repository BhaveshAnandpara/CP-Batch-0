import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true

public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {

        int hash[] = new int[101];
        int mostDuplicate = 0;

        for (int i : arr) {
            hash[i]++;
        }

        for (int i = 0; i < arr.size(); i++) {
            
            if(  hash[ arr.get(i) ] > mostDuplicate ){
                mostDuplicate = hash[ arr.get(i) ];
            }

        }

        return arr.size() - mostDuplicate;



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println( equalizeArray(arr) );

        sc.close();

    }

}
