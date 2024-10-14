package org.willxu.algorithm.service.integer;

public interface MinimumSwapsToMakeStringsEqual {
    /**
     * You are given two strings s1 and s2 of equal length consisting of
     * letters "x" and "y" only. Your task is to make these two strings
     * equal to each other. You can swap any two characters that belong
     * to different strings, which means: swap s1[i] and s2[j].
     * <p>
     * Return the minimum number of swaps required to make s1 and s2
     * equal, or return -1 if it is impossible to do so.
     *
     * @param s1,s2 1 <= s1.length, s2.length <= 1000
     *              s1.length == s2.length
     *              s1, s2 only contain 'x' or 'y'.
     */
    int minimumSwap(String s1, String s2);
}
