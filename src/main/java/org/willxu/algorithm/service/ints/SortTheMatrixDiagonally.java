package org.willxu.algorithm.service.ints;

public interface SortTheMatrixDiagonally {
    /**
     * A matrix diagonal is a diagonal line of cells starting from some
     * cell in either the topmost row or leftmost column and going in
     * the bottom-right direction until reaching the matrix's end. For
     * example, the matrix diagonal starting from mat[2][0], where mat
     * is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and
     * mat[4][2].
     * <p>
     * Given an m x n matrix mat of integers, sort each matrix diagonal
     * in ascending order and return the resulting matrix.
     *
     * @param mat m == mat.length
     *            n == mat[i].length
     *            1 <= m, n <= 100
     *            1 <= mat[i][j] <= 100
     */
    int[][] diagonalSort(int[][] mat);
}
