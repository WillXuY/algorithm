package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.RemoveLinkedListElements;

public class RemoveLinkedListElementsPointer
        implements RemoveLinkedListElements {
    @Override
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode pre = head;
        ListNode iterator = head.next;
        while (iterator != null) {
            if (iterator.val == val) {
                pre.next = iterator.next;
            } else {
                pre = iterator;
            }
            iterator = iterator.next;
        }
        return head;
    }
}
