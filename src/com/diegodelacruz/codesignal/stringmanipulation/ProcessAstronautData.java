package com.diegodelacruz.codesignal.stringmanipulation;

import java.util.StringTokenizer;

public class ProcessAstronautData {

    public static void processAstronautData(String data) {
        String[] details = data.split(";");

        for (String detail : details) {
            // TODO: Split the detail into astronaut name and planet,
            //       and strip away the whitespace.
            String sentence = detail.trim();

            StringTokenizer tokenizer = new StringTokenizer(sentence, "-");

            while (tokenizer.hasMoreTokens()) {
                String name = tokenizer.nextToken();
                String planet = tokenizer.nextToken();

                // TODO: Print the statement in the format "Astronaut [name] is exploring [planet]."
                System.out.println("Astronaut " + name + " is exploring " + planet + ".");
            }
        }
    }

    public static void main(String[] args) {
        String astronautData = "    Neil-Mars; Buzz-Jupiter; Sally-Venus    ";
        processAstronautData(astronautData);
    }

}
