package com.diegodelacruz.codesignal.loops;

/**
 * You are given a sentence represented by a string, where words are separated by spaces.
 * Your task is to write a Java function that performs the following:
 */
public class AsciiOddLoop {

    /**
     * 1. For each word with an even number of characters, extract the second half of the word.
     * 2. From this second half, select the characters whose ASCII values are less than the ASCII
     * value of a given character c.
     * 3. Concatenate all these selected characters and form a single output string, preserving
     * their order of appearance.
     *
     * @param sentence
     * @param c
     * @return
     */
    private String evenOddWord(String sentence, char c) {
        if (sentence == null || sentence.isBlank()) return "";
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        /* First approach
        for (String word : words) {
            if (word.length() % 2 == 0) {
                String halfWord = word.substring(word.length() / 2);
                for (char ch : halfWord.toCharArray()) {
                    if (ch < c) {
                        sb.append(ch);
                    }
                }
            }
        }*/

        // Second approach Memory efficient and avoids overhead of objects
        for (String word : words) {
            int wordLength = word.length();
            if (wordLength % 2 == 0) {

                for (int i = wordLength / 2; i < wordLength; i++) {
                    char ch = word.charAt(i);
                    if (ch < c) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();

    }

    /**
     * For example, consider the sentence: "Python is a high-level programming language." and the character 'n'.
     * The word 'Python' has 6 characters (an even number), with the second half being 'hon'. Within 'hon',
     * only the character 'h' has an ASCII value less than 'n'.
     * Hence, the output of your function for this example should be: "h".
     *
     * @param args
     */
    public static void main(String[] args) {
        AsciiOddLoop asciiOddLoop = new AsciiOddLoop();
        System.out.println(asciiOddLoop.evenOddWord("Python is a high-level programming language.", 'n'));
    }

}
