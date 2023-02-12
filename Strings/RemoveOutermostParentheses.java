package Strings;
// https://leetcode.com/problems/remove-outermost-parentheses/

public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {

        int openBraces = 0;
        int count = 0;

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                openBraces++;
            }

            if (s.charAt(i) == ')') {
                openBraces--;

                if (openBraces == 0) {
                    result.append(s.substring(i - count, i));
                    count = 0;
                } else
                    count += 2;
            }

        }

        return result.toString();

    }

    public static void main(String[] args) {

        // String s = "(()())(())";
        // String s = "(()())(())(()(()))";
        String s = "()()";

        System.out.println(removeOuterParentheses(s));

    }

}
