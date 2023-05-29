package org.willxu.algorithm.service.integer;

public interface MaximalSquare {
    /**
     * Given an m x n binary matrix filled with 0's and 1's, find the
     * largest square containing only 1's and return its area.
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m, n <= 300
     *               matrix[i][j] is '0' or '1'.
     */
    int maximalSquare(char[][] matrix);
}
