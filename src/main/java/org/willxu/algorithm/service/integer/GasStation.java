package org.willxu.algorithm.service.integer;

public interface GasStation {
    /**
     * There are n gas stations along a circular route, where the amount
     * of gas at the i^th station is gas[i].
     * <p>
     * You have a car with an unlimited gas tank and it costs cost[i] of
     * gas to travel from the i^th station to its next (i + 1)^th
     * station. You begin the journey with an empty tank at one of the
     * gas stations.
     * <p>
     * Given two integer arrays gas and cost, return the starting gas
     * station's index if you can travel around the circuit once in the
     * clockwise direction, otherwise return -1. If there exists a
     * solution, it is guaranteed to be unique
     *
     * @param gas,cost n == gas.length == cost.length
     *                 1 <= n <= 10^5
     *                 0 <= gas[i], cost[i] <= 10^4
     */
    int canCompleteCircuit(int[] gas, int[] cost);
}
