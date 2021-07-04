package org.willxu.algorithm.service.integer;

public interface SingleNumber {
    /**
     * Given a non-empty array of integers nums, every element appears
     * twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity
     * and use only constant extra space.
     *
     * Constraints:
     * Each element in the array appears twice except for one element
     * which appears only once.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -3 * 10^4 <= nums[i] <= 3 * 10^4
     * @return value of the single number
     */
    int singleNumber(int[] nums);
}
