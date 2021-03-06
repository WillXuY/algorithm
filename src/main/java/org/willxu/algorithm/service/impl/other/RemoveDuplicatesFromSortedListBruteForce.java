package org.willxu.algorithm.service.impl.other;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.other.RemoveDuplicatesFromSortedList;

public class RemoveDuplicatesFromSortedListBruteForce
        implements RemoveDuplicatesFromSortedList {

    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Exception 1: NullPointException
        if (head == null) {
            return null;
        }
        ListNode r = new ListNode(head.val, head.next);
        ListNode iterator = r;
        while (iterator.next != null) {
            if (iterator.val == iterator.next.val) {
                iterator.next = iterator.next.next;
            } else {
                /*
                Wrong answer 1: do this only if
                iterator != iterator.next
                 */
                iterator = iterator.next;
            }
        }
        return r;
    }
}
