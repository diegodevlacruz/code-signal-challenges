package com.diegodelacruz.codesignal.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You will be given two arrays of integers. The first array has n elements, and the second array has k elements.
 * Sizes n and k both range from 1 to 100, inclusive. The elements of both arrays can fall within a range of -100 to 100, inclusive.
 */
public class PerfectSquarePairs {

    /**
     * Your task is to write a Java function that will locate and return a list of all pairs of integers with the property that the
     * first element of each pair comes from the first array and the second element of each pair comes from the second array,
     * such that the sum of the two elements of the pair is a perfect square. A perfect square, as you know, is an integer that is
     * the square of another integer.
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public List<int[]> findPerfectSquarePairs(int[] arr1, int[] arr2) {
        // TODO: Implement this function
        if (arr1 == null || arr2 == null) return new ArrayList<>();
        List<int[]> result = new ArrayList<>();

        /* First approach using nested loops (for i)
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int num1 = arr1[i];
                int num2 = arr2[j];

                double sqrt = Math.sqrt(num1 + num2);
                if (sqrt == Math.floor(sqrt)) {
                    int[] validSqrt = new int[]{num1, num2};
                    result.add(validSqrt);
                }
            }

        }
        return result;
         */

        /*Second approach using nested loops (for each)
         */
        for (int a : arr1) {
            for (int b : arr2) {
                if (Math.sqrt(a + b) % 1 == 0) {
                    result.add(new int[]{a, b});
                }
            }
        }


        /* Approach using java streams (Arrays.stream because int[], filter and forEach)
        Arrays.stream(arr1).forEach(a ->
                Arrays.stream(arr2)
                        .filter(b -> Math.sqrt(a + b) % 1 == 0)
                        .forEach(b -> result.add(new int[]{a, b}))
        );
        */

        return result;
    }

    /**
     * The order of pairs in your output should correspond to the order of the elements in the input arrays.
     * For example, if the two arrays are {2, 3, 16} and {1, 9, 10}, the function should return {{3, 1}, {16, 9}}
     * because 3+1=4 (which is the square of 2) and 16+9=25 (which is the square of 5).
     * <p>
     * If no such pairs exist, or if either input array is empty, your function should return an empty list.
     *
     * @param args
     */
    public static void main(String[] args) {
        PerfectSquarePairs perfectSquarePairs = new PerfectSquarePairs();
        int[] arr1 = new int[]{4, 13, 23};
        int[] arr2 = new int[]{-4, -3, -24};
        //int[] arr1 = new int[]{2, 3, 16};
        //int[] arr2 = new int[]{1, 9, 16};
        List<int[]> pairs = perfectSquarePairs.findPerfectSquarePairs(arr1, arr2);

        pairs.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);

    }
}
