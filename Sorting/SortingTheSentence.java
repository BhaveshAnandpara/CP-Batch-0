package Sorting;
import java.util.*;

public class SortingTheSentence {

    public static  String sortSentence(String s) {

        String[] result = new String[10];

        String[] arr = s.split(" ");
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            result[ (int)arr[i].charAt( arr[i].length() - 1) - 48 ]  =  arr[i];
        }


        for ( int i = 0 ; i < result.length ; i++ ) {

            if( result[i] != null ){

                if( i != 1 ){
                    str +=" ";
                }
                str += result[i].substring(0 , (result[i].length() - 1 ));
            }
        }

        return str;

    }

    public static void main(String[] args) {

        System.out.println( sortSentence( "is2 sentence4 This1 a3" ) );

    }

}
