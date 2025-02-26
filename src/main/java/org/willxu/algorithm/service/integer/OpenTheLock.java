package org.willxu.algorithm.service.integer;

public interface OpenTheLock {
    /**
     * You have a lock in front of you with 4 circular wheels. Each
     * wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8',
     * '9'. The wheels can rotate freely and wrap around: for example we
     * can turn '9' to be '0', or '0' to be '9'. Each move consists of
     * turning one wheel one slot.
     * <p>
     * The lock initially starts at '0000', a string representing the
     * state of the 4 wheels.
     * <p>
     * You are given a list of deadends dead ends, meaning if the lock
     * displays any of these codes, the wheels of the lock will stop
     * turning and you will be unable to open it.
     * <p>
     * Given a target representing the value of the wheels that will
     * unlock the lock, return the minimum total number of turns
     * required to open the lock, or -1 if it is impossible.
     *
     * @param deadends 1 <= deadends.length <= 500
     *                 deadends[i].length == 4
     * @param target target.length == 4
     *               target will not be in the list deadends.
     *               target and deadends[i] consist of digits only.
     */
    int openLock(String[] deadends, String target);
}
