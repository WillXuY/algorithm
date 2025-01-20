package org.willxu.algorithm.service.integer;

public interface FindTwoNonOverlappingSubArraysEachWithTargetSum {
	/**
	 * You are given an array of integers arr and an integer target.
	 * You have to find two non-overlapping sub-arrays of arr each with
	 * a sum equal target. There can be multiple answers so you have to
	 * find an answer where the sum of the lengths of the two sub-arrays
	 * is minimum.
	 * Return the minimum sum of the lengths of the two required
	 * sub-arrays, or return -1 if you cannot find such two sub-arrays.
	 * 
	 * @param arr 1 <= arr[i] <= 1000
	 *            1 <= arr.length <= 10^5
	 * @param target 1 <= target <= 10^8
	 */
	int minSumOfLengths(int[] arr, int target);
}
