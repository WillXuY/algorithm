package org.willxu.algorithm.domain.queue;

/**
 * Design your implementation of the circular queue. The circular queue
 * is a linear data structure in which the operations are performed
 * based on FIFO (First In First Out) principle, and the last position
 * is connected back to the first position to make a circle. It is also
 * called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of
 * the spaces in front of the queue. In a normal queue, once the queue
 * becomes full, we cannot insert the next element even if there is a
 * space in front of the queue. But using the circular queue, we can use
 * the space to store new values.
 * <p>
 * Implement the MyCircularQueue class:
 * <p>
 * MyCircularQueue(k) Initializes the object with the size of the queue
 * to be k.
 * <p>
 * You must solve the problem without using the built-in queue data
 * structure in your programming language.
 * <p>
 * - 1 <= k <= 1000
 * - 0 <= value <= 1000
 * - At most 3000 calls will be made to enQueue, deQueue, Front, Rear,
 *   isEmpty, and isFull.
 */
public interface DesignCircularQueue {
    /**
     * Inserts an element into the circular queue. Return true if the
     * operation is successful.
     */
    boolean enQueue(int value);

    /**
     * Deletes an element from the circular queue. Return true if the
     * operation is successful.
     */
    boolean deQueue();

    /**
     * Gets the front item from the queue. If the queue is empty,
     * return -1.
     */
    int Front();

    /**
     * Gets the last item from the queue. If the queue is empty,
     * return -1.
     * @return
     */
    int Rear();

    /**
     * Checks whether the circular queue is empty or not.
     */
    boolean isEmpty();

    /**
     * Checks whether the circular queue is full or not.
     */
    boolean isFull();
}
