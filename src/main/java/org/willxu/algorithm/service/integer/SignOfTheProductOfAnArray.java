package org.willxu.algorithm.service.integer;

public interface SignOfTheProductOfAnArray {
    /**
     * There is a function signFunc(x) that returns:
     *
     * - 1 if x is positive.
     * - -1 if x is negative.
     * - 0 if x is equal to 0.
     *
     * You are given an integer array nums. Let product be the product
     * of all values in the array nums.
     *
     * Return signFunc(product).
     *
     * @param nums 1 <= nums.length <= 1000
     *             -100 <= nums[i] <= 100
     */
    int arraySign(int[] nums);
}
