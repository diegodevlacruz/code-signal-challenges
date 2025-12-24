package com.diegodelacruz.codesignal.stringmanipulation;

import java.util.*;

public class ReversedPairs {

    public List<int[]> solution(List<Integer> numbers) {
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>(numbers);

        for (Integer num : numbers) {
            int reversedNum = reverseNumber(num);
            
            // Check if reverse exists in original list and it's not the same number
            if (numberSet.contains(reversedNum)) {
                // Add both pairs
                pairs.add(new int[]{num, reversedNum});
            }
        }
        
        return pairs;
    }

    private int reverseNumber(int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num))
                                .reverse()
                                .toString());
    }

    public static void main(String[] args) {
        ReversedPairs solution = new ReversedPairs();
        List<Integer> numbers = Arrays.asList(12, 21, 34, 43, 56, 65);
        List<int[]> result = solution.solution(numbers);
        
        // Print result in required format
        StringBuilder output = new StringBuilder("{");
        for (int i = 0; i < result.size(); i++) {
            output.append("{").append(result.get(i)[0])
                  .append(", ").append(result.get(i)[1]).append("}");
            if (i < result.size() - 1) {
                output.append(", ");
            }
        }
        output.append("}");
        
        System.out.println(output);
    }
}
