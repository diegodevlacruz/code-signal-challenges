package com.diegodelacruz.codesignal.stringmanipulation;

public class SplittingAndReversingWords {
    /**
     * Given a string consisting of words separated by whitespace,
     * your task is to write a function that accepts this string.
     * It then replaces each character in the words with the corresponding
     * character opposite in the English alphabet and stitches them all together to form a new string.
     *
     * @param inputStr
     * @return
     */
    public String solution(String inputStr) {
        // TODO: implement the string transformation function
        if (inputStr.isBlank()) return inputStr;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (Character.isLowerCase(ch)) {
                char lowerOpposite = (char) ('a' + ('z' - ch));
                sb.append(lowerOpposite);
            } else if (Character.isUpperCase(ch)) {
                char UpperOpposite = (char) ('A' + ('Z' - ch));
                sb.append(UpperOpposite);
            } else {
                sb.append(ch);
            }
        }

        String[] words = sb.toString().split(" ");
        StringBuilder newSb = new StringBuilder();
        newSb.append(words[words.length - 1]);
        for (int i = 0; i < words.length - 1; i++) {
            newSb.append(" ").append(words[i]);
        }

        return newSb.toString();
    }


    /**
     * - The input string will include between 1 and 100 words.
     * - Each word consists of characters separated by white space.
     * - A word is composed of characters ranging from a to z or A to Z. So, if a word contains a lowercase 'a', for instance, it should be replaced with 'z', 'b' with 'y', 'c' with 'x', and so on, maintaining the same case. For words with an uppercase 'A', it should be replaced with 'Z', 'B' with 'Y', 'C' with 'X', and so forth, while preserving the uppercase.
     * - The given string will not start or end with a space, and there will be no occurrence of double spaces.
     * - After transforming the characters of the words, form a new string by taking the last word first and appending the remaining words in their original order, each separated by spaces.
     *
     * @param args
     */
    public static void main(String[] args) {

        String sample = "CapitaL letters";

        SplittingAndReversingWords app = new SplittingAndReversingWords();
        System.out.println(app.solution(sample));

    }

}