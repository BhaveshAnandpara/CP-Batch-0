package Sorting;

// https://leetcode.com/problems/minimum-absolute-difference/
import java.util.*;

public class MinimumAbsoluteDifference {

     public static List< List<Integer> >  minimumAbsDifference(int[] arr) {

        List< List<Integer> > res = new ArrayList<>();
        Arrays.sort(arr);
        
        
        int minDiff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
                

                if(  arr[i+1] - arr[i]  < minDiff ){
                    minDiff =  arr[i + 1] - arr[i] ;
                    res.clear();
                }

                if(  arr[i+1] - arr[i]  ==  minDiff ){
                    res.add( new ArrayList<>( Arrays.asList( arr[i] , arr[i+1])) );
                }



        }

        return res;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,6,10,15};

        System.out.println( minimumAbsDifference( arr ) );

        sc.close();
    }
    
}
