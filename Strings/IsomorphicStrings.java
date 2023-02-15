package Strings;
// https://leetcode.com/problems/isomorphic-strings/

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        int[] sMap = new int[256]; // 256 Because there are 256 ASCII characters
        int[] tMap = new int[256];

        char min = Character.MIN_VALUE; // to get char of ASCII value 0

        char s_ch = min;
        char t_ch = min;

        // store t char into sMap and s char into tMap ( for s = badc  , t = baba )
        // --> sMap[ ( b , b ) , ( a , a ) , ( d , b ) ]
        // --> tMap[ ( b , b ) , ( a , a ) ] ---> ( b == b ) already hence return false
        for (int i = 0; i < s.length(); i++) {

            s_ch = s.charAt(i);
            t_ch = t.charAt(i);

            if ((sMap[(int) s_ch - min] == 0 || sMap[(int) s_ch - min] == t_ch)
                    && (tMap[(int) t_ch - min] == 0 || tMap[(int) t_ch - min] == s_ch)) {

                sMap[(int) s_ch - min] = t_ch;
                tMap[(int) t_ch - min] = s_ch;

            } else {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        String s = "qwertyuiop[]asdfghjkl;'\\zxcvbnm,./"; // badc
        String t = "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz"; // baba

        System.out.println(isIsomorphic(s, t));

    }

}
