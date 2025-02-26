package org.willxu.algorithm.service.integer;

public interface MinimumOperationsToMakeArrayEqual {
	/**
	 * You have an array arr of length n where arr[i] = (2 * i) + 1 for
	 * all valid values of i (i.e., 0 <= i < n).
	 * <p>
	 * In one operation, you can select two indices x and y where
	 * 0 <= x, y < n and subtract 1 from arr[x] and add 1 to arr[y]
	 * (i.e., perform arr[x] -=1 and arr[y] += 1). The goal is to make
	 * all the elements of the array equal. It is guaranteed that all
	 * the elements of the array can be made equal using some operations.
	 * <p>
	 * Given an integer n, the length of the array, return the minimum
	 * number of operations needed to make all the elements of arr equal.
	 * 
	 * @param n 1 <= n <= 10^4
	 */
	int minOperations(int n);
}
