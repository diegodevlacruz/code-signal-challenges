package com.diegodelacruz.codesignal.stringmanipulation;

import java.util.ArrayList;

public class StringParser {


    public static int parseAndMultiplyNumbers(String inputString) {
        String num = "";
        ArrayList<Integer> numbers = new ArrayList<>();

        for (char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            } else if (!num.isEmpty()) {
                numbers.add(Integer.parseInt(num));
                num = "";
            }
        }
        if (!num.isEmpty()) {
            numbers.add(Integer.parseInt(num));
        }

        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // Call the method
        System.out.println(parseAndMultiplyNumbers("I have 2 apples and 5 oranges"));
    }
}
