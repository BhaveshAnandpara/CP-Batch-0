import java.util.Scanner;

// https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true

public class Encryption {

    public static String encryption(String s) {

        String trimedString = s.replaceAll("\\s", "");

        int len = trimedString.length();
        int rows = (int) Math.floor(Math.sqrt(trimedString.length()));

        int cols = (int) Math.ceil(Math.sqrt(trimedString.length()));

        if (rows * cols < len) {
            rows++;
        }

        // Using 2d Array
        /*
         * 
         * 
         * char[][] arr = new char[rows][cols];
         * 
         * for (int i = 0; i < rows; i++) {
         * 
         * for (int j = 0; j < cols; j++) {
         * 
         * if ( (i * cols) + j < len) {
         * arr[i][j] = trimedString.charAt((i * cols) + j);
         * }
         * else{
         * arr[i][j] = '#';
         * }
         * }
         * }
         * 
         * String result = "";
         * 
         * for (int i = 0; i < cols; i++) {
         * for (int j = 0; j < rows; j++) {
         * 
         * if( arr[j][i] == '#') result+= "";
         * else result+= arr[j][i];
         * }
         * result+= " ";
         * }
         * 
         * 
         * return result;
         */


         //Using Iterations

         String result = "";

         for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {
                j = (j*cols);
                result += "" + trimedString.charAt( j );
            }
            result+= " ";
         }

         return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(encryption(s));

        sc.close();

    }
}
