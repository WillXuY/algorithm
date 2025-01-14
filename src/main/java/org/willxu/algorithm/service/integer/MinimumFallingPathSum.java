package org.willxu.algorithm.service.integer;

public interface MinimumFallingPathSum {
    /**
     * Given an n x n array of integers matrix, return the minimum sum
     * of any falling path through matrix.
     * <p>
     * A falling path starts at any element in the first row and chooses
     * the element in the next row that is either directly below or
     * diagonally left/right. Specifically, the next element from
     * position (row, col) will be (row + 1, col - 1), (row + 1, col),
     * or (row + 1, col + 1).
     *
     * @param matrix n == matrix.length == matrix[i].length
     *               1 <= n <= 100
     *               -100 <= matrix[i][j] <= 100
     */
    int minFallingPathSum(int[][] matrix);
}
