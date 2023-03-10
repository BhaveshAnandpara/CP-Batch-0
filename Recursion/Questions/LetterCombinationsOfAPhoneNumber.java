package Recursion.Questions;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    static List<String> result = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {

        if (digits.isEmpty())
            return new ArrayList<>();

        combine("", digits);
        return result;

    }

    private static void combine(String item, String digits) {

        if (digits.isEmpty()) {
            result.add(item);
            return;
        }

        int firstDigit = (int) digits.charAt(0) - '0'; // the digit --> 2,3,4,5,6,...9
        int additionalVal = (firstDigit > 7) ? (firstDigit - 2) * 3 + 1 : (firstDigit - 2) * 3; // 97 + additional value
        int noOfDigits = (firstDigit == 7 || firstDigit == 9) ? 4 : 3; // noOfDigits in that value --> either 3 or 4

        if (!(firstDigit < 2)) {

            for (int i = 0; i < noOfDigits; i++) {
                combine(item + (char) ('a' + additionalVal + i), digits.substring(1));
            }

        }

        else {

            combine(item, digits.substring(1));

        }

    }


    public static void main(String[] args) {

        String digits = "97";

        System.out.println(letterCombinations(digits));

    }

}