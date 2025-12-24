package com.diegodelacruz.codesignal.stringmanipulation;

/**
 * You are provided with a string of alphanumeric characters in which each number,
 * regardless of the number of digits, is always followed by at least one alphabetic
 * character before the next number appears. The task requires you to return a
 * transformed version of the string where in the first alphabetic character following
 * each number is moved to a new position within the string and characters in between
 * are removed.
 */
public class ParsingAndMultiplyingNumbers {

    /**
     * Specifically, for each number in the original string, identify the next letter that
     * follows it, and then reposition that character to directly precede the number.
     * All spaces and punctuation marks between the number and the letter are removed.
     *
     * @param input
     * @return
     */
    public String solution(String input) {
        // First verify that input is not empty or null
        /*
        if (input == null || input.isEmpty()) return input;
        StringBuilder sb = new StringBuilder();

        int n = input.length();
        int value = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                value = Character.getNumericValue(ch);
            } else if (Character.isLetter(ch) && value != 0) {
                sb.append(ch).append(value);
                value = 0;
            } else if ((Character.isLetter(ch) || ch == '\'') && value == 0) {
                sb.append(ch);
            } else if ((ch == ' ' || ch == '.') && value == 0) {
                sb.append(ch);
            }

        }

         */
        if (input == null || input.isEmpty()) return input;
        StringBuilder sb = new StringBuilder();
        int pendingDigit = -1;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                // State 1: Found a number, switch to "Pending" state
                pendingDigit = Character.getNumericValue(ch);
            } else if (pendingDigit != -1) {
                // State 2: Inside the "gap". Waiting for a letter.
                if (Character.isLetter(ch)) {
                    // Found the letter! Swap order: Letter first, then Digit.
                    sb.append(ch).append(pendingDigit);
                    pendingDigit = -1; // Reset to "Normal" state
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();

    }

    /**
     * Example: "I have 2 apples and 5! oranges and 3 grapefruits."
     * Should return: "I have a2pples and o5ranges and g3rapefruits."
     * <p>
     * Explanation: n this instance, the character 'a' following the number 2 is moved to come
     * before the 2, the 'o' succeeding the 5 is placed before the 5, and the 'g'
     * subsequent to the 3 is repositioned to precede the 3. Punctuation marks and
     * spaces are disregarded as they are not alphabetic characters.
     * <p>
     * Please note that the operation should maintain the sequential order of the numbers and the
     * rest of the text. Considering this, the task is not solely about dividing a string into
     * substrings but also about modifying them. This will test your expertise in Java string
     * operations and type conversions.
     *
     * @param args
     */

    public static void main(String[] args) {
        ParsingAndMultiplyingNumbers p = new ParsingAndMultiplyingNumbers();

        String result2 = p.solution("4 foxes are chasing 1 rabbit.");
        System.out.println(result2);
        System.out.println("It is right2: " + result2.equals("f4oxes are chasing r1abbit."));


        String result = p.solution("I have 2 apples and 5! oranges and 3 grapefruits.");
        System.out.println(result);
        System.out.println("It is right1: " + result.equals("I have a2pples and o5ranges and g3rapefruits."));

        String result3 = p.solution("Let's meet at 7 at the clock tower.");
        System.out.println(result3);
        System.out.println("It is right3: " + result3.equals("Let's meet at a7t the clock tower."));


    }

}
