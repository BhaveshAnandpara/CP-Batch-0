import java.util.Scanner;

// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

public class TimeConversion {

    public static String timeConversion(String s) {

        String format = "" + s.charAt(s.length() - 2) + s.charAt(s.length() - 1);
        String[] time = s.split(":");


        if( format.equals("AM") ){
            int hr = Integer.parseInt( time[0] ) % 12 ;

            if ( Math.floor( Math.log10(hr) ) < 2 ){
                return "0" + hr + ":" + time[1] + ":" + time[2].substring( 0 , 2 ) ;
            }
            return "" + hr + ":" + time[1] + ":" + time[2].substring( 0 , 2 ) ;
        }else{
            
            int hr = ( Integer.parseInt(time[0]) % 12 )+ 12 ;
            return "" + hr + ":" + time[1] + ":" + time[2].substring( 0 , 2 ) ;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(timeConversion(s));

        sc.close();

    }

}
