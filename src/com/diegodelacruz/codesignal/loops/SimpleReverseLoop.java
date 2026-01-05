package com.diegodelacruz.codesignal.loops;

public class SimpleReverseLoop {

    private String reverseLoop() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        SimpleReverseLoop simpleReverseLoop = new SimpleReverseLoop();
        System.out.println(simpleReverseLoop.reverseLoop());
    }

}
