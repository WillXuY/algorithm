package org.willxu.algorithm.service.integer;

public interface LongestSubarrayOfOnesAfterDeletingOneElement {
	/**
	 * Given a binary array nums, you should delete one element from it.
	 * <p>
	 * Return the size of the longest non-empty subarray containing only
	 * 1's in the resulting array. Return 0 if there is no such subarray.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             nums[i] is either 0 or 1.
	 */
	int longestSubarray(int[] nums);
}
