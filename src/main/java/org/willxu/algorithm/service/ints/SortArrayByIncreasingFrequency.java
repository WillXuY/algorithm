package org.willxu.algorithm.service.ints;

public interface SortArrayByIncreasingFrequency {
    /**
     * Given an array of integers nums, sort the array in increasing
     * order based on the frequency of the values. If multiple values
     * have the same frequency, sort them in decreasing order.
     *
     * Return the sorted array.
     *
     * @param nums 1 <= nums.length <= 100
     *             -100 <= nums[i] <= 100
     */
    int[] frequencySort(int[] nums);
}
