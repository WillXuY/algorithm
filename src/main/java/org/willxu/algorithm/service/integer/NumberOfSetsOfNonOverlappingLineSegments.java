package org.willxu.algorithm.service.integer;

public interface NumberOfSetsOfNonOverlappingLineSegments {

	/**
	 * Given n points on a 1-D plane, where the ith point (from 0 to
	 * n-1) is at x = i, find the number of ways we can draw exactly k
	 * non-overlapping line segments such that each segment covers two
	 * or more points. The endpoints of each segment must have integral
	 * coordinates. The k line segments do not have to cover all n
	 * points, and they are allowed to share endpoints.
	 * <p>
	 * Return the number of ways we can draw k non-overlapping line
	 * segments. Since this number can be huge, return it modulo
	 * 10^9 + 7.
	 * 
	 * @param n 2 <= n <= 1000
	 * @param k 1 <= k <= n - 1
	 */
	int numberOfSets(int n, int k);
}
