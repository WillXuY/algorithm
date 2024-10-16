package org.willxu.algorithm.service.doublepoint;

public interface AirplaneSeatAssignmentProbability {
    /**
     * n passengers board an airplane with exactly n seats. The first
     * passenger has lost the ticket and picks a seat randomly. But
     * after that, the rest of the passengers will:
     * <p>
     * - Take their own seat if it is still available, and
     * - Pick other seats randomly when they find their seat occupied
     * Return the probability that the nth person gets his own seat.
     *
     * @param n 1 <= n <= 10^5
     */
    double nthPersonGetsNthSeat(int n);
}