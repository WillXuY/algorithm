package org.willxu.algorithm.service.integer;

public interface KokoEatingBananas {
    /**
     * Koko loves to eat bananas. There are n piles of bananas, the ith
     * pile has piles[i] bananas. The guards have gone and will come
     * back in h hours.
     * <p>
     * Koko can decide her bananas-per-hour eating speed of k. Each
     * hour, she chooses some pile of bananas and eats k bananas from
     * that pile. If the pile has less than k bananas, she eats all of
     * them instead and will not eat any more bananas during this hour.
     * <p>
     * Koko likes to eat slowly but still wants to finish eating all the
     * bananas before the guards return.
     * <p>
     * Return the minimum integer k such that she can eat all the
     * bananas within h hours.
     *
     * @param piles 1 <= piles.length <= 10^4
     *              1 <= piles[i] <= 10^9
     * @param h piles.length <= h <= 10^9
     */
    int minEatingSpeed(int[] piles, int h);
}
