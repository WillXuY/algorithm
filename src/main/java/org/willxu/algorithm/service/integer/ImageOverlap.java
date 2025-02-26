package org.willxu.algorithm.service.integer;

public interface ImageOverlap {
    /**
     * You are given two images, img1 and img2, represented as binary,
     * square matrices of size n x n. A binary matrix has only 0s and 1s
     * as values.
     * <p>
     * We translate one image however we choose by sliding all the 1
     * bits left, right, up, and/or down any number of units. We then
     * place it on top of the other image. We can then calculate the
     * overlap by counting the number of positions that have a 1 in both
     * images.
     * <p>
     * Note also that a translation does not include any kind of
     * rotation. Any 1 bits that are translated outside of the matrix
     * borders are erased.
     * <p>
     * Return the largest possible overlap.
     *
     * @param img1,img2 n == img1.length == img1[i].length
     *                  n == img2.length == img2[i].length
     *                  1 <= n <= 30
     *                  img1[i][j] is either 0 or 1.
     *                  img2[i][j] is either 0 or 1.
     */
    int largestOverlap(int[][] img1, int[][] img2);
}
