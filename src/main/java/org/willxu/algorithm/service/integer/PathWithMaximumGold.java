package org.willxu.algorithm.service.integer;

public interface PathWithMaximumGold {
    /**
     * In a gold mine grid of size m x n, each cell in this mine has an
     * integer representing the amount of gold in that cell, 0 if it is
     * empty.
     * <p>
     * Return the maximum amount of gold you can collect under the
     * conditions:
     * <p>
     * - Every time you are located in a cell you will collect all the
     *   gold in that cell.
     * - From your position, you can walk one step to the left, right,
     *   up, or down.
     * - You can't visit the same cell more than once.
     * - Never visit a cell with 0 gold.
     * - You can start and stop collecting gold from any position in the
     *   grid that has some gold.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 15
     *             0 <= grid[i][j] <= 100
     *             There are at most 25 cells containing gold.
     */
    int getMaximumGold(int[][] grid);
}
