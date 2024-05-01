package org.willxu.algorithm.service.ints;

public interface PrisonCellsAfterNdays {
    /**
     * There are 8 prison cells in a row and each cell is either
     * occupied or vacant.
     * <p>
     * Each day, whether the cell is occupied or vacant changes
     * according to the following rules:
     * <p>
     * - If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
     * - Otherwise, it becomes vacant.
     * <p>
     * Note that because the prison is a row, the first and the last
     * cells in the row can't have two adjacent neighbors.
     * <p>
     * You are given an integer array cells where cells[i] == 1 if the
     * i^th cell is occupied and cells[i] == 0 if the i^th cell is
     * vacant, and you are given an integer n.
     * <p>
     * Return the state of the prison after n days (i.e., n such changes
     * described above).
     *
     * @param cells cells.length == 8
     *              cells[i] is either 0 or 1.
     * @param n 1 <= n <= 10^9
     */
    int[] prisonAfterNDays(int[] cells, int n);
}
