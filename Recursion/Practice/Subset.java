package Recursion.Practice;

import java.util.*;

public class Subset {

    static List<String> ans = new ArrayList<>();

    // Install commentimg extension to see the image using comment
    // <cmg "ImageNotes/SubsetRecursive.jpg">

    static void subseq(String p, String up) {

        if (up.isEmpty()) {
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1)); // processed
        subseq(p, up.substring(1)); // unprocessed

    }

    // <cmg "ImageNotes/IterativeSubSeq.jpg">
    // Notice how before dotted line is array and after dotted line array is
    // repeated only new number is added in all items

    static List<List<Integer>> subseqIterative(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>(); // [ [],[],[] ]<--- Outer Array

        outer.add(new ArrayList<>()); // Add Empty Item first ( first node in image )

        for (int num : arr) { // for every number

            int size = outer.size(); // get the size of array before dotted line

            for (int i = 0; i < size; i++) { // same array as before dotted line just add num in every item

                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }

        }

        return outer;

    }

    // <cmg "ImageNotes/handleDuplicateSubSeq.png">

    static List<List<Integer>> repSubseqIterative(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int dupCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int size = outer.size();

            int j = 0;
            
            if (i != 0 && arr[i - 1] == arr[i]) {
                j = (size + dupCount) / 2 ;
                dupCount = j ;
            } else {
                dupCount = 0;
            }

            for (; j < size; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }

        return outer;
    }

    public static void main(String[] args) {

        // subseq("", "abc");
        // System.out.println(ans);

        int[] arr = { 1,2,2, 2 };
        System.out.println(repSubseqIterative(arr));

    }

}

