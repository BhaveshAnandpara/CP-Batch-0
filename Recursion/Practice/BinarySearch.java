package Recursion.Practice;

public class BinarySearch {


    public static int bsearch( int[] arr , int target , int start , int end){

        int mid = start + ( end - start ) / 2;

        if( arr[mid] == target ){
            return mid;
        }
        if( start > end ) return -1;

        if( target < arr[mid] ) return bsearch(arr, target , start , mid - 1);
        else return bsearch(arr, target , mid+1 , end);



    }

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6,7,8,9 };
        int target = 6;

        System.out.println(  bsearch(arr , target , 0  , arr.length - 1) );
    }
    
}
