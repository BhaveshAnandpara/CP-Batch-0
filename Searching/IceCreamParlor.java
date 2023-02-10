package Searching;
// https://www.hackerrank.com/challenges/icecream-parlor/problem?isFullScreen=true

import java.util.*;

public class IceCreamParlor {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        int n = 0;
        int n2 = 0;

        for (int i = 0; i < arr.size(); i++) {

            n = arr.get(i);
            n2 = search( m - n , arr , i );

            if( n2 != -1 ) return new ArrayList<>(Arrays.asList(i + 1 , n2 + 1 ));

        }

        return new ArrayList<>(Arrays.asList(- 1, -1));

    }

    public static int search(int target, List<Integer> arr , int nPosition) {


        for (int i = 0; i < arr.size() ; i++) {
            
            if( arr.get(i) == target && i != nPosition ){
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        List<Integer> cost = new ArrayList<>(Arrays.asList(2 , 2 , 4 , 3));
        int m = 4;

        System.out.println(icecreamParlor(m, cost));

    }

}
