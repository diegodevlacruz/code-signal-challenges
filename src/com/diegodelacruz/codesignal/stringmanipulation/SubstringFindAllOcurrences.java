package com.diegodelacruz.codesignal.stringmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given two lists, sentences and words, each comprising n strings, where n ranges from 1 to 100 inclusive.
 * Each string in the sentences list has a length ranging from 1 to 500 inclusive. Each word in the words list is a
 * single lowercase English alphabet word of length 1 to 10 inclusive.
 */
public class SubstringFindAllOcurrences {

    /**
     * Your task is to find all instances of each word in the corresponding sentence from the sentences list and
     * replace them with the reverse of the word. The words and sentences at the same index in their respective
     * lists are deemed to correspond to each other. Note that the words are case-insensitive, meaning that if
     * some of its characters are capitalized in the sentence, it also counts as a occurrence of the word.
     * <p>
     * Return a new list comprising n strings, where each string is the sentence from the sentences list at the
     * corresponding index, with all instances of the word from the words list at the same index replaced with its reverse.
     *
     * @param sentences
     * @param words
     * @return
     */
    public List<String> solution(List<String> sentences, List<String> words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < sentences.size(); i++) {
            String sentence = sentences.get(i);
            String word = words.get(i);
            StringBuilder sb = new StringBuilder(sentence);

            // search in a case-insensitive way
            String lowerSentence = sentence.toLowerCase();
            String lowerWord = word.toLowerCase();

            int start_pos = lowerSentence.lastIndexOf(lowerWord);

            while (start_pos != -1) {
                StringBuilder reverseString = new StringBuilder(lowerWord).reverse();

                if (Character.isUpperCase(sb.charAt(start_pos))) {
                    reverseString.setCharAt(0, Character.toUpperCase(reverseString.charAt(0)));
                }

                sb.replace(start_pos, start_pos + word.length(), reverseString.toString());

                start_pos = lowerSentence.lastIndexOf(lowerWord, start_pos - 1);
            }
            result.add(sb.toString());

        }

        // TODO: implement the solution
        return result; // Placeholder for the result
    }

    /**
     * If the word is not found in the respective sentence, keep the sentence as it is.
     * Remember, while replacing the instances of word in the sentence, you should preserve
     * the case of the initial letter of the word. If a word starts with a capital letter in
     * the sentence, its reversed form should also start with a capital letter.
     * <p>
     * <p>
     * Example:
     * For sentences = {"this is a simple example.", "the name is bond. james bond.", "remove every single e"} and
     * words = {"simple", "bond", "e"}, the output should be
     * {"this is a elpmis example.", "the name is dnob. james dnob.", "remove every single e"}.
     *
     * @param args
     */
    public static void main(String[] args) {
        SubstringFindAllOcurrences findAllOcurrences = new SubstringFindAllOcurrences();
        List<String> sentences = Arrays.asList("lower case sentence", "upper case Sentence", "another Sentence here", "final Sentence yay");
        List<String> words = Arrays.asList("sentence", "sentence", "sentence", "sentence");
        List<String> allOccurrences = findAllOcurrences.solution(sentences, words);
        for (String occurrence : allOccurrences) {
            System.out.println(occurrence);
        }

    }

}
