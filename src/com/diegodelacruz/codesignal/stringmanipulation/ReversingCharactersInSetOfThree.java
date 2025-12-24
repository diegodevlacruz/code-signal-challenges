package com.diegodelacruz.codesignal.stringmanipulation;

public class ReversingCharactersInSetOfThree {

    /**
     * In this task, you are given a string s, and your goal is to produce a new string following a specific pattern.
     * You are to take characters in sets of three, reverse the characters in each set, and then place them back into
     * the string in their original positions, preserving the reverse order within each set. If 1 or 2 characters remain
     * at the end (because the length of the string is not divisible by 3), they should be left as they are.
     *
     * @param s
     * @return
     */
    public String reversedTripleChars(String s) {
        // TODO: Implement the function that reforms the string as described above
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i += 3) {
            int endIndex = i + 3;

            if (endIndex > length) {
                // Append remaining 1 or 2 characters consecutively
                for (int j = i; j < length; j++) {
                    sb.append(s.charAt(j));
                }
            } else {
                // Reverse groups of 3
                for (int j = endIndex - 1; j >= i; j--) {
                    sb.append(s.charAt(j));
                }
            }

        }

        return sb.toString();
    }

    /**
     * For example, if you are given the input 'abcdef', the output should be 'cbafed'. For the input 'abcdefg',
     * your function should provide 'cbafedg'.
     *
     * @param args
     */
    public static void main(String[] args) {
        var reversingCharactersInSetOfThee = new ReversingCharactersInSetOfThree();
        System.out.println(reversingCharactersInSetOfThee.reversedTripleChars("abcde"));
    }

}
