package org.willxu.algorithm.service.ints;

public interface TheStrongestValuesInAnArray {
	/**
	 * Given an array of integers arr and an integer k.
	 * <p>
	 * A value arr[i] is said to be stronger than a value arr[j] if
	 * |arr[i] - m| > |arr[j] - m| where m is the median of the array.
	 * <p>
	 * If |arr[i] - m| == |arr[j] - m|, then arr[i] is said to be stronger
	 * than arr[j] if arr[i] > arr[j].
	 * <p>
	 * Return a list of the strongest k values in the array. return the
	 * answer in any arbitrary order.
	 * <p>
	 * Median is the middle value in an ordered integer list. More
	 * formally, if the length of the list is n, the median is the
	 * element in position ((n - 1) / 2) in the sorted list (0-indexed).
	 * <p>
	 * - For arr = [6, -3, 7, 2, 11], n = 5 and the median is obtained by
	 *   sorting the array arr = [-3, 2, 6, 7, 11] and the median is
	 *   arr[m] where m = ((5 - 1) / 2) = 2. The median is 6.
	 * - For arr = [-7, 22, 17, 3], n = 4 and the median is obtained by
	 *   sorting the array arr = [-7, 3, 17, 22] and the median is
	 *   arr[m] where m = ((4 - 1) / 2) = 1. The median is 3.
	 * 
	 * @param arr 1 <= arr.length <= 10^5
	 *            -10^5 <= arr[i] <= 10^5
	 * @param k 1 <= k <= arr.length
	 */
	int[] getStrongest(int[] arr, int k);
}
