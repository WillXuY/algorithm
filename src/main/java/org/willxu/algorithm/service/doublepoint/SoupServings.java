package org.willxu.algorithm.service.doublepoint;

public interface SoupServings {
    /**
     * There are two types of soup: type A and type B. Initially, we
     * have n ml of each type of soup. There are four kinds of
     * operations:
     * <p>
     * 1. Serve 100 ml of soup A and 0 ml of soup B,
     * 2. Serve 75 ml of soup A and 25 ml of soup B,
     * 3. Serve 50 ml of soup A and 50 ml of soup B, and
     * 4. Serve 25 ml of soup A and 75 ml of soup B.
     * <p>
     * When we serve some soup, we give it to someone, and we no longer
     * have it. Each turn, we will choose from the four operations with
     * an equal probability 0.25. If the remaining volume of soup is not
     * enough to complete the operation, we will serve as much as
     * possible. We stop once we no longer have some quantity of both
     * types of soup.
     * <p>
     * Note that we do not have an operation where all 100 ml's of soup
     * B are used first.
     * <p>
     * Return the probability that soup A will be empty first, plus half
     * the probability that A and B become empty at the same time.
     * Answers within 10-5 of the actual answer will be accepted.
     *
     * @param n 0 <= n <= 10^9
     */
    double soupServings(int n);
}
