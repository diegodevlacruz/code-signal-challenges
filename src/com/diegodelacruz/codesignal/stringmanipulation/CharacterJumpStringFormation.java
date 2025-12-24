package com.diegodelacruz.codesignal.stringmanipulation;

public class CharacterJumpStringFormation {

    public String repeatCharJump(String inputString, int step) {
        // TODO: Implement the solution to generate n-length string as per given instructions.
        // You can use StringBuilder to store characters.
        StringBuilder sb = new StringBuilder();
        int length = inputString.length();
        for (int i = 0; i < length * step; i += step) {
            if (length > i) {
                sb.append(inputString.charAt(i));
            } else {
                int postion = i % length;
                sb.append(inputString.charAt(postion));
            }
        }
        return sb.toString();
    }

    /**
     * For example, if inputString is "abcdefg" and step is 3, the function should return "adgcfbe".
     * @param args
     */
    public static void main(String[] args) {
        var characterJumpStringFormation = new CharacterJumpStringFormation();
        System.out.println(characterJumpStringFormation.repeatCharJump("abcdefg", 3));
    }

}