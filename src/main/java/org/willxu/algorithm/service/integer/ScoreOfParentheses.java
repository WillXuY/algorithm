package org.willxu.algorithm.service.integer;

public interface ScoreOfParentheses {
    /**
     * Given a balanced parentheses string s, return the score of the
     * string.
     * <p>
     * The score of a balanced parentheses string is based on the
     * following rule:
     * <p>
     * - "()" has score 1.
     * - AB has score A + B, where A and B are balanced parentheses
     *   strings.
     * - (A) has score 2 * A, where A is a balanced parentheses string.
     *
     * @param s 2 <= s.length <= 50
     *          s consists of only '(' and ')'.
     *          s is a balanced parentheses string.
     */
    int scoreOfParentheses(String s);
}
