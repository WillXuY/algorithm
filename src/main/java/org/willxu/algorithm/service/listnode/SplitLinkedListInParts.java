package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface SplitLinkedListInParts {
    /**
     * Given the head of a singly linked list and an integer k, split
     * the linked list into k consecutive linked list parts.
     * <p>
     * The length of each part should be as equal as possible: no two
     * parts should have a size differing by more than one. This may
     * lead to some parts being null.
     * <p>
     * The parts should be in the order of occurrence in the input list,
     * and parts occurring earlier should always have a size greater
     * than or equal to parts occurring later.
     * <p>
     * Return an array of the k parts.
     *
     * @param head The number of nodes in the list is in the range
     *             [0, 1000].
     *             0 <= Node.val <= 1000
     * @param k 1 <= k <= 50
     */
    ListNode[] splitListToParts(ListNode head, int k);
}
