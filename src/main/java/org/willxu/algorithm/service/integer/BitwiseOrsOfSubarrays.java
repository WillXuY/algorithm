package org.willxu.algorithm.service.integer;

public interface BitwiseOrsOfSubarrays {
    /**
     * Given an integer array arr, return the number of distinct bitwise
     * ORs of all the non-empty subarrays of arr.
     * <p>
     * The bitwise OR of a subarray is the bitwise OR of each integer
     * in the subarray. The bitwise OR of a subarray of one integer is
     * that integer.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within
     * an array.
     *
     * @param arr 1 <= arr.length <= 5 * 10^4
     *            0 <= arr[i] <= 10^9
     */
    int subarrayBitwiseORs(int[] arr);
}
