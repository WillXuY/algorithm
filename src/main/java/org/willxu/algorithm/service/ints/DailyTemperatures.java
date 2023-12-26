package org.willxu.algorithm.service.ints;

public interface DailyTemperatures {
    /**
     * Given an array of integers temperatures represents the daily
     * temperatures, return an array answer such that answer[i] is the
     * number of days you have to wait after the i^th day to get a
     * warmer temperature. If there is no future day for which this is
     * possible, keep answer[i] == 0 instead.
     *
     * @param temperatures 1 <= temperatures.length <= 10^5
     *                     30 <= temperatures[i] <= 100
     */
    int[] dailyTemperatures(int[] temperatures);
}
