package org.willxu.algorithm.service.integer;

import java.util.List;

public interface MaximumLengthOfConcatenatedStringWithUniqueCharacters {
    /**
     * You are given an array of strings arr. A string s is formed by
     * the concatenation of a subsequence of arr that has unique
     * characters.
     * <p>
     * Return the maximum possible length of s.
     * <p>
     * A subsequence is an array that can be derived from another array
     * by deleting some or no elements without changing the order of the
     * remaining elements.
     *
     * @param arr 1 <= arr.length <= 16
     *            1 <= arr[i].length <= 26
     *            arr[i] contains only lowercase English letters.
     */
    int maxLength(List<String> arr);
}
