package org.willxu.algorithm.service.ints;

public interface SingleNumberIii {
    /**
     * Given an integer array nums, in which exactly two elements appear
     * only once and all the other elements appear exactly twice. Find
     * the two elements that appear only once. You can return the answer
     * in any order.
     * <p>
     * You must write an algorithm that runs in linear runtime
     * complexity and uses only constant extra space.
     *
     * @param nums 2 <= nums.length <= 3 * 10^4
     *             -2^31 <= nums[i] <= 2^31 - 1
     *             Each integer in nums will appear twice, only two
     *             integers will appear once.
     */
    int[] singleNumber(int[] nums);
}
