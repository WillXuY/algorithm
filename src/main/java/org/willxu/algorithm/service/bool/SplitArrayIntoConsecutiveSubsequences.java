package org.willxu.algorithm.service.bool;

public interface SplitArrayIntoConsecutiveSubsequences {
    /**
     * You are given an integer array nums that is sorted in
     * non-decreasing order.
     * <p>
     * Determine if it is possible to split nums into one or more
     * subsequences such that both of the following conditions are true:
     * <p>
     * - Each subsequence is a consecutive increasing sequence
     *   (i.e. each integer is exactly one more than the previous
     *   integer).
     * - All subsequences have a length of 3 or more.
     * <p>
     * Return true if you can split nums according to the above
     * conditions, or false otherwise.
     * <p>
     * A subsequence of an array is a new array that is formed from the
     * original array by deleting some (can be none) of the elements
     * without disturbing the relative positions of the remaining
     * elements. (i.e., [1,3,5] is a subsequence of [1,2,3,4,5] while
     * [1,3,2] is not).
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -1000 <= nums[i] <= 1000
     *             nums is sorted in non-decreasing order.
     */
    boolean isPossible(int[] nums);
}
