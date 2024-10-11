package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FindPositiveIntegerSolutionForGivenEquation {
    interface CustomFunction {
        // Returns some positive integer f(x, y) for two positive integers x and y based on a formula.
        int f(int x, int y);
    }

    /**
     * Given a callable function f(x, y) with a hidden formula and a
     * value z, reverse engineer the formula and return all positive
     * integer pairs x and y where f(x,y) == z. You may return the pairs
     * in any order.
     * <p>
     * While the exact formula is hidden, the function is monotonically
     * increasing, i.e.:
     * <p>
     * f(x, y) < f(x + 1, y)
     * f(x, y) < f(x, y + 1)
     * <p>
     * We will judge your solution as follows:
     * <p>
     * - The judge has a list of 9 hidden implementations of
     *   CustomFunction, along with a way to generate an answer key of
     *   all valid pairs for a specific z.
     * - The judge will receive two inputs: a function_id (to determine
     *   which implementation to test your code with), and the target z.
     * - The judge will call your findSolution and compare your results
     *   with the answer key.
     * - If your results match the answer key, your solution will be
     *   Accepted.
     * <p>
     * It is guaranteed that the solutions of f(x, y) == z will be in
     * the range 1 <= x, y <= 1000.
     * <p>
     * It is also guaranteed that f(x, y) will fit in 32 bit signed
     * integer if 1 <= x, y <= 1000.
     *
     * @param customfunction 1 <= function_id <= 9
     * @param z 1 <= z <= 100
     */
    List<List<Integer>> findSolution(CustomFunction customfunction, int z);
}
