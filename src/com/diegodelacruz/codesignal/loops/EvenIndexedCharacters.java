package com.diegodelacruz.codesignal.loops;

/**
 * Your objective is to write a Java method that selects the even-indexed characters of words containing an odd number of characters.
 */
public class EvenIndexedCharacters {

    /**
     * Make sure to consider punctuation as part of the word. For example, "Coding!" has a seven-character length.
     *
     * @param sentence
     * @return
     */
    public String reversedEvenIndexedChars(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";

        //First approach using nestes loops and iterating Forward
        String[] splitSentece = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : splitSentece) {
            if (word.length() % 2 != 0) {
                for (int i = 0; i < word.length(); i += 2) {
                    sb.append(word.charAt(i));
                }
            }
        }


        /* Second approach using nested loops iterating backwards (But is not asked by Code signal problem)
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        // Iterate backwards through words to avoid reversing the final large string
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (word.length() % 2 != 0) {
                //Append characters from the end of the word to the beggining
                for (int j = word.length() - 1; j >= 0; j-=2) {
                    sb.append(word.charAt(j));
                }
            }
        }

         */

        return sb.toString();
    }

    /**
     * For instance, if the input sentence is "Coding tasks are fun and required",
     * the output string should be "tssaefnad", which, when reversed, becomes "danfeasst".
     * The words "tasks", "are", "fun", and "and" are selected since they have an odd number
     * of characters, and the characters 't', 's', 's', 'a', 'e', 'f', 'n', 'a', 'd' at even
     * indexes are chosen and then reversed in the final string. Do not forget that Java indexing
     * begins at 0, so 't' in "tasks" is considered to be at an even index. Single-character words
     * must also be taken into consideration for this task.
     *
     * @param args
     */
    public static void main(String[] args) {
        EvenIndexedCharacters evenIndexedCharacters = new EvenIndexedCharacters();
        System.out.println(evenIndexedCharacters.reversedEvenIndexedChars("Coding tasks are fun and required"));
    }

}
