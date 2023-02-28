package Recursion.Practice;

import java.util.ArrayList;
import java.util.List;




public class Subset {
    
    static List<String > ans = new ArrayList<>();
    
// Install commentimg extension to see the image using comment
// <cmg "ImageNotes/SubsetRecursive.jpg">

    static void subseq( String p , String up ){

        if( up.isEmpty() ){
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1)); //processed
        subseq(p , up.substring(1)); //unprocessed

        
    }

// <cmg "ImageNotes/IterativeSubSeq.jpg">
// Notice how before dotted line is array and after dotted line array is repeated only new number is added in all items

    static List<List<Integer>> subseqIterative( int[] arr ){

        List<List<Integer>> outer = new ArrayList<>(); // [ [],[],[] ]<--- Outer Array

        outer.add( new ArrayList<>() ); // Add Empty Item first ( first node in  image )

        for (int num : arr) { // for every number

            int size = outer.size(); // get the size of array before dotted line

            for (int i = 0; i < size; i++) { // same array as before dotted line just add num in every item
                
                List<Integer> internal = new ArrayList<>( outer.get(i) );
                internal.add( num );
                outer.add(internal);
                
            }
            
        }

        return outer;

    }
    
    public static void main(String[] args) {
        
        subseq("", "abc");
        System.out.println( ans );

        int[] arr = {1,2,3};
        System.out.println( subseqIterative(arr) );
        
    }
    
}
