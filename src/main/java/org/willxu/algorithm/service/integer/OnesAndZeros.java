package org.willxu.algorithm.service.integer;

public interface OnesAndZeros {
    /**
     * You are given an array of binary strings strs and two integers m
     * and n.
     * <p>
     * Return the size of the largest subset of strs such that there are
     * at most m 0's and n 1's in the subset.
     * <p>
     * A set x is a subset of a set y if all elements of x are also
     * elements of y.
     *
     * @param strs 1 <= strs.length <= 600
     *             1 <= strs[i].length <= 100
     *             strs[i] consists only of digits '0' and '1'.
     * @param m,n 1 <= m, n <= 100
     */
    int findMaxForm(String[] strs, int m, int n);
}
