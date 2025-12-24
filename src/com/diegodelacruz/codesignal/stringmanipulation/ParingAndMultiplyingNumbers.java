package com.diegodelacruz.codesignal.stringmanipulation;

/**
 * Let's imagine you are given a string that contains a series of words separated by a hyphen ("-").
 * Each word in the string can be a lowercase letter from 'a' to 'z' or a set of digits representing a number from 1 to 26.
 * Your task is to parse this string and swap the type of each word: convert numbers into their corresponding English alphabet letters,
 * and letters into their numerical equivalents. This means '1' should convert to 'a', and 'a' should convert to '1'.
 */
public class ParingAndMultiplyingNumbers {

    public static void main(String[] args) {
        ParingAndMultiplyingNumbers paringAndMultiplyingNumbers = new ParingAndMultiplyingNumbers();
        // Input a-26-b-25-c-24
        // Expected result 1-z-2-y-3-x
        System.out.println(paringAndMultiplyingNumbers.solution("a-26-b-25-c-24"));
    }

    public String solution(String s) {

        // TODO: Implement the function that could solve the task
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];

            if (Character.isLetter(ch)) {
                int convertedChar = (ch - 'a') + 1;
                sb.append(convertedChar);

            } else if (Character.isDigit(ch)) {
                int value = Character.getNumericValue(ch);


                if (i + 1 < chars.length && Character.isDigit(chars[i + 1])) {
                    int nextDigit = Character.getNumericValue(chars[i + 1]);
                    value = value * 10 + nextDigit;
                    i++;
                }
                //else if () {

                //}

                if (value >= 1 && value <= 26) {
                    char letter = (char) ('a' + (value - 1));
                    sb.append(letter);
                }
            } else {
                sb.append("-");
            }

        }
        return sb.toString();
    }
}