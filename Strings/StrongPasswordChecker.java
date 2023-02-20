package Strings;

public class StrongPasswordChecker {

    public static int strongPasswordChecker(String password) {

        char[] arr = password.toCharArray();

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        int deleteActions = password.length() - 20;
        int otherActions = 0;

        char prev = arr[0];
        int freq = 0;

        char ch = '_';

        for (int i = 0; i <= arr.length; i++) {
            
            if( i == arr.length ) ch = '_';
            else ch = arr[i];

            if( Character.isDigit(ch) ) hasDigit = true;
            if( Character.isLowerCase(ch) ) hasLowerCase = true;
            if( Character.isUpperCase(ch) ) hasUpperCase = true;

            if( ch == prev ) freq++;

            else{

                if( freq > 3 && deleteActions > 0){

                    if( deleteActions <= 3 ){

                        freq--;
                        deleteActions--;

                    }
                    else{

                        freq -= 1 + ( 3 * ( deleteActions / 3 ) );
                        deleteActions -= 1 + ( 3 * ( deleteActions / 3 ) );

                    }

                    otherActions += freq/3;

                }



                prev = ch;
                freq = 1;
            }

        }

        if( !hasDigit ) {
            ++otherActions;
        }

        if( !hasLowerCase ) {
            ++otherActions;
        }

        if( !hasUpperCase ) {
            ++otherActions;
        }

        if( password.length() - 20 > 0  ) deleteActions = password.length() - 20;
        else deleteActions = 6 - password.length() ;

        return otherActions + deleteActions ; 

    }

    public static void main(String[] args) {

        String password = "bbaaaaaaaaaaaaaaacccccc";

        System.out.println(strongPasswordChecker(password));

    }

}

