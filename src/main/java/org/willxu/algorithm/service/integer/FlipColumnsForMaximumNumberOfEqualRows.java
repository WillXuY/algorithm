package org.willxu.algorithm.service.integer;

public interface FlipColumnsForMaximumNumberOfEqualRows {
    /**
     * You are given an m x n binary matrix matrix.
     * <p>
     * You can choose any number of columns in the matrix and flip every
     * cell in that column (i.e., Change the value of the cell from 0 to
     * 1 or vice versa).
     * <p>
     * Return the maximum number of rows that have all values equal
     * after some number of flips.
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m, n <= 300
     *               matrix[i][j] is either 0 or 1.
     */
    int maxEqualRowsAfterFlips(int[][] matrix);
}
