package com.diegodelacruz.codesignal.stringmanipulation;

import java.util.StringTokenizer;

public class StringTokenization {

    public static void main(String[] args) {
        String employeeData = "Alice,Developer,30|Bob,Manager,45|Charlie,Designer,25";

        // Note: The double backslash before "|" in the split method is required to escape the pipe character (|), as it is a special character in regular expressions
        String[] employeeList = employeeData.split("\\|");

        for (String employee : employeeList) {
            // TODO: Tokenize the employee data and determine eligibility for a junior position
            StringTokenizer tokenizer = new StringTokenizer(employee, ",");
            while (tokenizer.hasMoreTokens()) {
                String name = tokenizer.nextToken();
                String role = tokenizer.nextToken();
                int age = Integer.parseInt(tokenizer.nextToken());
                String eligibility = age < 40 ? "junior position" : "No elegible";
                System.out.println("Name: " + name + " - Role: " + role + " - Age: " + age + " " + eligibility);
            }
        }
    }
    /*
    public static void main(String[] args) {
        String sentence = "Java is an amazing language!";
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }*/
}


