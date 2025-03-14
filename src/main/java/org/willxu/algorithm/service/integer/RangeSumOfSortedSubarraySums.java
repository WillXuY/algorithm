package org.willxu.algorithm.service.integer;

public interface RangeSumOfSortedSubarraySums {
	/**
	 * You are given the array nums consisting of n positive integers.
	 * You computed the sum of all non-empty continuous subarrays from
	 * the array and then sorted them in non-decreasing order, creating
	 * a new array of n * (n + 1) / 2 numbers.
	 * <p>
	 * Return the sum of the numbers from index left to index right
	 * (indexed from 1), inclusive, in the new array. Since the answer
	 * can be a huge number return it modulo 10^9 + 7.
	 * 
	 * @param nums,n n == nums.length
	 *               1 <= nums.length <= 1000
	 *               1 <= nums[i] <= 100
	 * @param left,right 1 <= left <= right <= n * (n + 1) / 2
	 * @return
	 */
	int rangeSum(int[] nums, int n, int left, int right);
}
