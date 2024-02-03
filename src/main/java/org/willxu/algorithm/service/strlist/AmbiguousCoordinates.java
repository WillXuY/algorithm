package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface AmbiguousCoordinates {
    /**
     * We had some 2-dimensional coordinates, like "(1, 3)" or
     * "(2, 0.5)". Then, we removed all commas, decimal points, and
     * spaces and ended up with the string s.
     * <p>
     * - For example, "(1, 3)" becomes s = "(13)" and "(2, 0.5)" becomes
     *   s = "(205)".
     * <p>
     * Return a list of strings representing all possibilities for what
     * our original coordinates could have been.
     * <p>
     * Our original representation never had extraneous zeroes, so we
     * never started with numbers like "00", "0.0", "0.00", "1.0", "001",
     * "00.01", or any other number that can be represented with fewer
     * digits. Also, a decimal point within a number never occurs
     * without at least one digit occurring before it, so we never
     * started with numbers like ".1".
     * <p>
     * The final answer list can be returned in any order. All
     * coordinates in the final answer have exactly one space between
     * them (occurring after the comma.)
     *
     * @param s 4 <= s.length <= 12
     *          s[0] == '(' and s[s.length - 1] == ')'.
     *          The rest of s are digits.
     */
    List<String> ambiguousCoordinates(String s);
}
