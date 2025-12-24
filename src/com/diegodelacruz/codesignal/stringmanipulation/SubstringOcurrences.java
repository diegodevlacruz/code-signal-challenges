package com.diegodelacruz.codesignal.stringmanipulation;

/**
 * You are tasked with writing a function, public String replaceSubstring(String text,
 * String old, String newSubstr), that does the following:
 */
public class SubstringOcurrences {

    /**
     * 1. Accepts as input text (a string of length n, where 1 ≤ n ≤ 500, which includes only
     * lowercase alphabets and spaces), old (a string of length k, where 1 ≤ k ≤ n, which includes only
     * lowercase alphabets), and newSubstr (a string of length m, where 1 ≤ m ≤ 500, which includes only lowercase alphabets).
     * 2. Replaces every occurrence of the string old in text with the string newSubstr.
     * 3. Returns the updated text string with all replaced substrings.
     *
     * @param text
     * @param old
     * @param newSubstr
     * @return
     */
    public String replaceSubstring(String text, String old, String newSubstr) {
        String newText = text;
        boolean itContains = text.contains(old);
        if (itContains) {
            newText = text.replace(old, newSubstr);
        }
        return newText;
    }

    /**
     * Example:
     * replaceSubstring("hello world", "world", "friend")
     * Outpur: "hello friend"
     *
     * @param args
     */
    public static void main(String[] args) {
        SubstringOcurrences substringOcurrences = new SubstringOcurrences();
        System.out.println(substringOcurrences.replaceSubstring("hello world", "world", "friend"));
    }

}
