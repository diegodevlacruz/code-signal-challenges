package com.diegodelacruz.codesignal.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given two arrays: sourceArray and searchArray, consisting of n and m unique strings respectively,
 * where n is an integer such that 1 ≤ n ≤ 100 and m is an integer such that 1 ≤ m ≤ 500. Each string in both
 * arrays represents a number followed by a letter part, concatenated with a space. The numbers in both arrays range
 * from 1 to 100, inclusive. The letter parts in sourceArray consist of alphanumeric characters with lengths ranging
 * from 1 to 100, inclusive. The letter parts in searchArray have lengths ranging from 1 to 500, inclusive.
 */
public class StringSearch {


    /**
     * Your task is to implement a function stringSearch(sourceArray, searchArray) that takes these two arrays as
     * input and returns an array that includes all strings from sourceArray where the letter part
     * (the part after the number and space) appears as a substring in at least one string in searchArray and the
     * number of the source string is less than or equal to the number of the search string.
     * The order in which the strings appear in the result should reflect their original order in the sourceArray.
     * If no matches are found, the function should return an empty array.
     * @param sourceArray
     * @param searchArray
     * @return
     */
    public List<String> stringSearch(List<String> sourceArray, List<String> searchArray){
        return new ArrayList<>();
    }

    /**
     * For example, if sourceArray = {"1 abc", "2 def", "3 xyz"} and searchArray = {"1 abcdef", "5 uvwxy"},
     * the function should return {"1 abc"} since 'abc' and 'def' are substrings found in 'abcdef', but 'def' is
     * associated with 2 in sourceArray which is not less than or equal to 1 in searchArray. The string 'xyz' is
     * not found in either 'abcdef' or 'uvwxy', so it is not included in the result.
     * This task requires mastery of skills in nested looping and array manipulation, especially in the context
     * of searching for a string within other strings.
     * @param args
     */
    public static void main(String[] args) {

    }

}
