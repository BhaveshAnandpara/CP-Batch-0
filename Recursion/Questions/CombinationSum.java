package Recursion.Questions;
// https://leetcode.com/problems/combination-sum/

import java.util.*;

public class CombinationSum {

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        result.clear();
        findSum( new ArrayList<>(), candidates , target, 0 , 0 );
        return result;
        
    }

    public static void findSum(  List<Integer> arr , int[] candidates, int target , int pointer , int sum ){

        if( sum > target ) return;

        if( sum == target ) {
            result.add( new ArrayList<>( arr ) );
            return;
        }

        for (int i = pointer ; i < candidates.length ; i++) {            
                arr.add( candidates[i] );
                findSum(arr, candidates, target , i , sum+candidates[i]);
                arr.remove( arr.size() - 1 );
        }

    }


    public static void main(String[] args) {

        int[] candidates = {2,3,5};
        int target = 8;

        
        System.out.println(  combinationSum(candidates, target) );

    }

}
