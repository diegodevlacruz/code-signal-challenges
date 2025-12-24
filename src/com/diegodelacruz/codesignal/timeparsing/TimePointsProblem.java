package com.diegodelacruz.codesignal.timeparsing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given two input arguments: a list of strings timePoints and an integer addedSeconds.
 * Each string in timePoints is in the format "HH:MM:SS", representing a valid time from "00:00:00" to "23:59:59" inclusive.
 * The integer addedSeconds represents a number of seconds, ranging from 1 to 86,400. Your task is to create a new function,
 * addSecondsToTimes(timePoints, addedSeconds), which takes these two arguments and returns a new list of strings. Each string
 * in the returned list is the new time, calculated by adding the provided addedSeconds to the corresponding time in timePoints,
 * formatted in HH:MM:SS.
 */
public class TimePointsProblem {

    /**
     * The list timePoints contains n strings, where n can be any integer from 1 to 100 inclusive.
     * The time represented by each string in timePoints is guaranteed to be valid. The total time,
     * after adding addedSeconds, can roll over to the next day.
     *
     * @param timePoints
     * @param addedSeconds
     * @return
     */
    public List<String> addSecondsToTimes(List<String> timePoints, int addedSeconds) {
        // TODO: implement the function
        //String time = "";
        List<String> newTimes = new ArrayList<>();

        for (String timePoint : timePoints) {
            String[] timeSplit = timePoint.split(":");
            int hours = Integer.parseInt(timeSplit[0]);
            int minutes = Integer.parseInt(timeSplit[1]);
            int seconds = Integer.parseInt(timeSplit[2]);

            int secondsSinceStart = hours * 3600 + minutes * 60 + seconds;
            int totalSeconds = (secondsSinceStart + addedSeconds) % (24 * 3600);

            int newHours = totalSeconds / 3600;
            totalSeconds %= 3600;
            int newMinutes = totalSeconds / 60;
            int newSeconds = totalSeconds % 60;

            newTimes.add(String.format("%02d:%02d:%02d", newHours, newMinutes, newSeconds));

        }
        return newTimes;
    }

    /**
     * Example:
     * For timePoints = {'10:00:00', '23:30:00'} and addedSeconds = 3600, the output should be {'11:00:00', '00:30:00'}.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("10:00:00", "23:30:00");
        TimePointsProblem tp = new TimePointsProblem();
        List<String> convertedTimes = tp.addSecondsToTimes(timePoints, 3600);
        System.out.println(convertedTimes);
    }

}
