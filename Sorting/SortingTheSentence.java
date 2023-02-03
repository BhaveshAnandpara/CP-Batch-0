package Sorting;

public class SortingTheSentence {

    public static  String sortSentence(String s) {

        String[] result = new String[10]; // size 10 bcoz maximum 10 words ( constraint given )

        String[] arr = s.split(" "); // will create array of words ["is2","sentence4","This1","a3"]
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            result[ (int)arr[i].charAt( arr[i].length() - 1) - 48 ]  =  arr[i]; // storing word based on digit so result[2] = is2
        }

        // result = [ null , "This1" , "is2" , "a3" , "sentence4"  , null ....]

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
