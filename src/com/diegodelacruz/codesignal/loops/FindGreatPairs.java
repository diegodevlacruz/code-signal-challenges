package com.diegodelacruz.codesignal.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given two arrays of unique integers (arrayA and arrayB), each containing n elements, with n ranging from 1 to 500.
 * Each element in both arrays could range from -1000 to 1000, inclusive.
 */
public class FindGreatPairs {

    /**
     * Your task is to write a Java function that identifies pairs of integers {a, b} wherein a belongs to arrayA and b belongs to arrayB,
     * and a is greater than b. The function should return all such pairs in the order in which a appears in arrayA.
     *
     * @param arrayA
     * @param arrayB
     * @return
     */
    public List<int[]> findGreaterPairs(List<Integer> arrayA, List<Integer> arrayB) {
        // TODO: Find the pairs of integers a, b where a belongs to arrayA and b belongs to arrayB such that a is greater than b
        // Your code goes here

        /*
        // First approach using nested loops
        List<int[]> result = new ArrayList<>();
        if (arrayA.isEmpty() || arrayB.isEmpty()) {
            return new ArrayList<>();
        } else {
            for (int i = 0; i < arrayA.size(); i++) {
                for (int j = 0; j < arrayB.size(); j++) {
                    int a = arrayA.get(i);
                    int b = arrayB.get(j);
                    if (a > b) {
                        int[] arr = new int[]{a, b};
                        result.add(arr);
                    }
                }
            }
        }
        return result;

         */

        // Second approach using java streams
        return arrayA.stream()
                .flatMap(a -> arrayB.stream()
                        .filter(b -> a > b)
                        .map(b -> new int[]{a, b}))
                .toList();
    }

    /**
     * For instance, if arrayA consists of {5, 1, 8, -2, 0} and arrayB comprises {3, 2, 7, 10, -1},
     * the output should be {{5, 3}, {5, 2}, {5, -1}, {1, -1}, {8, 3}, {8, 2}, {8, 7}, {8, -1}, {0, -1}}.
     * <p>
     * Importantly, the order of elements in the output pairs should reflect the sequence in which a appears in arrayA.
     * A pair cannot be included more than once. If no pair meets the condition, the function should return an empty list.
     * <p>
     * Hint: Solving this task requires the use of nested loops. The outer loop should iterate through arrayA and the inner
     * loop through arrayB, checking the condition a > b during each iteration.
     *
     * @param args
     */
    public static void main(String[] args) {
        FindGreatPairs findGreatPairs = new FindGreatPairs();
        //List<Integer> arrayA = Arrays.asList(5, 1, 8, -2, 0);
        //List<Integer> arrayB = Arrays.asList(3, 2, 7, 10, -1);
        List<Integer> arrayA = Arrays.asList(3, 2, 1);
        List<Integer> arrayB = Arrays.asList(1, 2, 3);
        List<int[]> greatPairsResult = findGreatPairs.findGreaterPairs(arrayA, arrayB);

        greatPairsResult.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

}
