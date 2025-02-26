package org.willxu.algorithm.service.integer;

public interface AsFarFromLandAsPossible {
    /**
     * Given an n x n grid containing only values 0 and 1, where 0
     * represents water and 1 represents land, find a water cell such
     * that its distance to the nearest land cell is maximized, and
     * return the distance. If no land or water exists in the grid,
     * return -1.
     * <p>
     * The distance used in this problem is the Manhattan distance: the
     * distance between two cells (x0, y0) and (x1, y1) is
     * |x0 - x1| + |y0 - y1|.
     *
     * @param grid n == grid.length
     *             n == grid[i].length
     *             1 <= n <= 100
     *             grid[i][j] is 0 or 1
     */
    int maxDistance(int[][] grid);
}
