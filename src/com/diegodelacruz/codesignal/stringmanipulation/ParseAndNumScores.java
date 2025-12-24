package com.diegodelacruz.codesignal.stringmanipulation;

/**
 * You are given a string s of length n, with n ranging from 1 to 500 inclusive.
 * This string represents the complex and jumbled record of a sports game.
 * It combines player names and scores but lacks a uniform structure.
 * The player names consist of words made up of lowercase English alphabets (a-z),
 * while the scores are integers ranging from 1 to 100 inclusive.
 */
public class ParseAndNumScores {


    /**
     * This function should parse the given string, isolate the integers representing player scores, and return the sum of these scores.
     *
     * @param s
     * @return
     */
    public int parseAndSumScores(String s) {
        // TODO: implement
        int i = 0;
        int count = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int value = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    value = value * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                count += value;

            } else {
                i++;
            }
        }

        return count;
    }

    /**
     * For instance, for the input string, "joe scored 5 points, while adam scored 10 points and bob scored 2,
     * with an extra 1 point scored by joe", your function should return the sum 5 + 10 + 2 + 1, which totals 18.
     *
     * @param args
     */
    public static void main(String[] args) {
        ParseAndNumScores main = new ParseAndNumScores();
        int score = main.parseAndSumScores("michael scored 100 points");
        System.out.println(score);
    }
}
