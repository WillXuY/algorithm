package org.willxu.algorithm.service.string;

/**
 * There are two kinds of threads: oxygen and hydrogen. Your goal is to
 * group these threads to form water molecules.
 * <p>
 * There is a barrier where each thread has to wait until a complete
 * molecule can be formed. Hydrogen and oxygen threads will be given
 * releaseHydrogen and releaseOxygen methods respectively, which will
 * allow them to pass the barrier. These threads should pass the
 * barrier in groups of three, and they must immediately bond with each
 * other to form a water molecule. You must guarantee that all the
 * threads from one molecule bond before any other threads from the next
 * molecule do.
 * <p>
 * In other words:
 * <p>
 * - If an oxygen thread arrives at the barrier when no hydrogen threads
 *   are present, it must wait for two hydrogen threads.
 * - If a hydrogen thread arrives at the barrier when no other threads
 *   are present, it must wait for an oxygen thread and another hydrogen
 *   thread.
 * <p>
 * We do not have to worry about matching the threads up explicitly; the
 * threads do not necessarily know which other threads they are paired
 * up with. The key is that threads pass the barriers in complete sets;
 * thus, if we examine the sequence of threads that bind and divide them
 * into groups of three, each group should contain one oxygen and two
 * hydrogen threads.
 * <p>
 * Write synchronization code for oxygen and hydrogen molecules that
 * enforces these constraints.
 * <p>
 * 3 * n == water.length
 * 1 <= n <= 20
 * water[i] is either 'H' or 'O'.
 * There will be exactly 2 * n 'H' in water.
 * There will be exactly n 'O' in water.
 */
public abstract class BuildingH2o {
    public BuildingH2o() {}

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
    }
}
