package org.willxu.algorithm.domain.impl.array;

import org.willxu.algorithm.domain.array.AbstractNumArray;

public class NumArrayCycle extends AbstractNumArray {
    private final int[] nums;

    public NumArrayCycle(int[] nums) {
        super(nums);
        this.nums = nums;
    }

    @Override
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}