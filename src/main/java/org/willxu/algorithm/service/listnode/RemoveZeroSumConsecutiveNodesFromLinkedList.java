package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface RemoveZeroSumConsecutiveNodesFromLinkedList {
    /**
     * Given the head of a linked list, we repeatedly delete consecutive
     * sequences of nodes that sum to 0 until there are no such
     * sequences.
     * <p>
     * After doing so, return the head of the final linked list. You may
     * return any such answer.
     * <p>
     * (Note that in the examples below, all sequences are
     * serializations of ListNode objects.)
     *
     * @param head The given linked list will contain between 1 and 1000
     *             nodes.
     *             Each node in the linked list has
     *             -1000 <= node.val <= 1000.
     */
    ListNode removeZeroSumSublists(ListNode head);
}
