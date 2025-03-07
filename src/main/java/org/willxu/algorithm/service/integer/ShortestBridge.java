package org.willxu.algorithm.service.integer;

public interface ShortestBridge {
    /**
     * You are given an n x n binary matrix grid where 1 represents
     * land and 0 represents water.
     * <p>
     * An island is a 4-directionally connected group of 1's not
     * connected to any other 1's. There are exactly two islands in grid.
     * <p>
     * You may change 0's to 1's to connect the two islands to form one
     * island.
     * <p>
     * Return the smallest number of 0's you must flip to connect the
     * two islands.
     *
     * @param grid n == grid.length == grid[i].length
     *             2 <= n <= 100
     *             grid[i][j] is either 0 or 1.
     *             There are exactly two islands in grid.
     */
    int shortestBridge(int[][] grid);
}
