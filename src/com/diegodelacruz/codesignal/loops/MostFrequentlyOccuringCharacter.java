package com.diegodelacruz.codesignal.loops;

/**
 * You are given a string of n words, with n ranging from 1 to 100,
 * inclusive.The words are separated by a single space in the string.
 * Your task is to return the most frequently occurring character in each word
 * that has an odd number of characters.
 * The resulting characters should be concatenated into a string with their
 * occurrences in the sentence.
 */
public class MostFrequentlyOccuringCharacter {

    /**
     * 1. Each word's character count ranges from 1 to 500, inclusive. The string
     * contains lowercase and uppercase alphanumeric
     * characters, spaces, and punctuation.
     * 2. For instance, if the input string is "Hello world this is a demo string",
     * your function should return "lwa".
     * In this string, 'Hello', 'world', and 'a' have an odd number of characters.
     * The most frequently occurring character in
     * these words are 'l', 'w', and 'a' respectively. When concatenated, they form
     * "lwa".
     * 3. In case of a tie in character frequency, return the character that appears
     * first in the word.
     * In the example above, we took 'w' from the word 'world'.
     *
     * @param sentence
     * @return
     */
    public String oddNumsOfChars(String sentence) {
        if (sentence.isEmpty() || sentence == null)
            return "";
        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split(" ");

        for (String word : words) {

            if (word.length() % 2 != 0) {
                for (int i = 0; i < word.toCharArray().length; i++) {
                    final int index = i;
                    long count = word.chars().filter(ch -> ch == word.charAt(index)).count();
                    if(count == 1){
                        sb.append(word.charAt(0)); 
                    }else{
                        sb.append(word);
                    }
                }

            }
        }

        return "";
    }

    /**
     * 1. The function should be case insensitive. The lowercase and uppercase
     * characters should be counted as the same character.
     * The output should only contain lowercase characters. For example: "Hhi"
     * should return "h" because "h" appears twice in the
     * string even though one is uppercase and one is lowercase.
     * 2. If there are no words with an odd number of characters in the input
     * string, your function should return an empty string.
     * 3. The input string will always be at least one character long, and it cannot
     * be just a single whitespace.
     * 
     * @param args
     */
    public static void main(String[] args) {
        MostFrequentlyOccuringCharacter mostFrequentlyOccuringCharacter = new MostFrequentlyOccuringCharacter();
        System.out.println(mostFrequentlyOccuringCharacter.oddNumsOfChars("Hello world this is a demo string"));
    }

}
