package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.RunningSumOf1DimensionalArray;

public class RunningSumOf1DimensionalArrayLoop
        implements RunningSumOf1DimensionalArray {
    @Override
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] + nums[i];
        }
        return output;
    }
}
