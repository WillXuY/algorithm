package org.willxu.algorithm.service.integer;

public interface StringCompression {
    /**
     * Given an array of characters chars, compress it using the
     * following algorithm:
     * <p>
     * Begin with an empty string s. For each group of consecutive
     * repeating characters in chars:
     * <p>
     * - If the group's length is 1, append the character to s.
     * - Otherwise, append the character followed by the group's length.
     * <p>
     * The compressed string s should not be returned separately, but
     * instead, be stored in the input character array chars. Note that
     * group lengths that are 10 or longer will be split into multiple
     * characters in chars.
     * <p>
     * After you are done modifying the input array, return the new
     * length of the array.
     * <p>
     * You must write an algorithm that uses only constant extra space.
     *
     * @param chars 1 <= chars.length <= 2000
     *              chars[i] is a lowercase English letter, uppercase
     *              English letter, digit, or symbol.
     */
    int compress(char[] chars);
}
