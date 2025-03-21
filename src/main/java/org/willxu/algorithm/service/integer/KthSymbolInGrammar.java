package org.willxu.algorithm.service.integer;

public interface KthSymbolInGrammar {
    /**
     * We build a table of n rows (1-indexed). We start by writing 0 in
     * the 1^st row. Now in every subsequent row, we look at the
     * previous row and replace each occurrence of 0 with 01, and each
     * occurrence of 1 with 10.
     * <p>
     * - For example, for n = 3, the 1^st row is 0, the 2^nd row is 01,
     *   and the 3^rd row is 0110.
     * <p>
     * Given two integer n and k, return the k^th (1-indexed) symbol in
     * the n^th row of a table of n rows.
     *
     * @param n 1 <= n <= 30
     * @param k 1 <= k <= 2^(n - 1)
     */
    int kthGrammar(int n, int k);
}
