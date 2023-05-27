package org.willxu.algorithm.service.integer;

public interface HouseRobberIi {
    /**
     * You are a professional robber planning to rob houses along a
     * street. Each house has a certain amount of money stashed. All
     * houses at this place are arranged in a circle. That means the
     * first house is the neighbor of the last one. Meanwhile, adjacent
     * houses have a security system connected, and it will
     * automatically contact the police if two adjacent houses were
     * broken into on the same night.
     * <p>
     * Given an integer array nums representing the amount of money of
     * each house, return the maximum amount of money you can rob
     * tonight without alerting the police.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 1000
     */
    int rob(int[] nums);
}
