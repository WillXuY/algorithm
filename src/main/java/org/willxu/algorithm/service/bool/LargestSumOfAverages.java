package org.willxu.algorithm.service.bool;

public interface LargestSumOfAverages {
    /**
     * You are given an integer array nums and an integer k. You can
     * partition the array into at most k non-empty adjacent subarrays.
     * The score of a partition is the sum of the averages of each
     * subarray.
     * <p>
     * Note that the partition must use every integer in nums, and that
     * the score is not necessarily an integer.
     * <p>
     * Return the maximum score you can achieve of all the possible
     * partitions. Answers within 10^-6 of the actual answer will be
     * accepted.
     *
     * @param nums 1 <= nums.length <= 100
     *             1 <= nums[i] <= 10^4
     * @param k 1 <= k <= nums.length
     */
    double largestSumOfAverages(int[] nums, int k);
}
