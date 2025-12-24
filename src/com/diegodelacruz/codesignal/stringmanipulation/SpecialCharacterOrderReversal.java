package com.diegodelacruz.codesignal.stringmanipulation;

/**
 * In this task, you are given a string composed of lowercase English alphabet letters ('a' to 'z').
 * The length of the string will range from 1 to 100 characters. Your challenge is to create a new
 * string resulting from a unique order of character selection from the original string.
 */
public class SpecialCharacterOrderReversal {

    /**
     * You need to develop a Java method, public String specialOrder(String inputString), which takes inputString as an argument.
     * The resulting string begins with the last character of the inputString, then selects the second-to-last character,
     * continuing in reverse order until you reach the middle character of the string. Then, start with the first character of
     * the inputString, proceed to the second character, and continue in this manner until you reach the middle character.
     *
     * @param inputString
     * @return
     */
    public String specialOrder(String inputString) {
        // TODO: Implement function
        StringBuilder result = new StringBuilder();
        int length = inputString.length();

        for (int i = 0; i < length; i++) {
            if (i < length - length / 2) {
                result.append(inputString.charAt(length - 1 - i));
            }else{
                int firstHalf = i-(length - length / 2);
                result.append(inputString.charAt(firstHalf));
            }
        }

        return result.toString();
    }

    /**
     * For example, if the inputString is "abcdefg", the method should return "gfedabc".
     *
     * @param args
     */
    public static void main(String[] args) {
        var specialCharacterOrderReversal = new SpecialCharacterOrderReversal();
        System.out.println(specialCharacterOrderReversal.specialOrder("abcdefg"));
    }

}
