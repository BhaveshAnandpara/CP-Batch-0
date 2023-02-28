package Recursion.Practice;

public class RemoveA {

    static String removeA(String s) {

        if (s.length() < 1)
            return "";

        String ans = "";
        if (s.charAt(0) != 'a' && s.charAt(0) != 'A')
            ans = s.charAt(0) + "";

        return ans + removeA(s.substring(1));

    }

    static String removeInvalidString(String s, String invalid, String valid) {

        String ans = "";
        ans = s.charAt(0) + "";

        if (s.length() < invalid.length())
            return s;

        if (s.startsWith(invalid) && !s.startsWith(valid)) { // if "app"
                return removeInvalidString(s.substring(invalid.length()), invalid, valid); //remove search after "app"
        }

        return ans + removeInvalidString(s.substring(1), invalid, valid);

    }

    public static void main(String[] args) {

        // Remove A Que
        // String s = "absadasas"; // ans = bsdss
        String s = "zrxfczazxachjsba"; // ans = zrxfczzxchjsb

        // System.out.println( removeA(s) );

        // Remove invalid strings
        String s1 = "assadappleappjhg"; // ans = assadapplejhg only remove "app" if it is not "apple"
        String invalid = "app";
        String valid = "apple";

        System.out.println(removeInvalidString(s1, invalid, valid));

    }

}
