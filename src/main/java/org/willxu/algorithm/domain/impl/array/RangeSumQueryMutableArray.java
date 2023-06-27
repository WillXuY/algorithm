package org.willxu.algorithm.domain.impl.array;

import org.willxu.algorithm.domain.array.RangeSumQueryMutable;

public class RangeSumQueryMutableArray implements RangeSumQueryMutable {
    private int[] nums;

    public RangeSumQueryMutableArray(int[] nums) {
        this.nums = nums;
    }

    @Override
    public void update(int index, int val) {
        nums[index] = val;
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