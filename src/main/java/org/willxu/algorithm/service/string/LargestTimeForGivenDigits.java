package org.willxu.algorithm.service.string;

public interface LargestTimeForGivenDigits {
    /**
     * Given an array arr of 4 digits, find the latest 24-hour time that
     * can be made using each digit exactly once.
     * <p>
     * 24-hour times are formatted as "HH:MM", where HH is between 00
     * and 23, and MM is between 00 and 59. The earliest 24-hour time is
     * 00:00, and the latest is 23:59.
     * <p>
     * Return the latest 24-hour time in "HH:MM" format. If no valid
     * time can be made, return an empty string.
     *
     * @param arr arr.length == 4
     *            0 <= arr[i] <= 9
     */
    String largestTimeFromDigits(int[] arr);
}
