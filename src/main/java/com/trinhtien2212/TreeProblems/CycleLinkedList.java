package com.trinhtien2212.TreeProblems;



public class CycleLinkedList {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode curr = head;
        curr.next = new ListNode(2);
        curr = curr.next;
        ListNode cycle = curr;
        curr.next = new ListNode(0);
        curr = curr.next;
        curr.next = new ListNode(-4);
        curr = curr.next;
        curr.next = cycle;
        System.out.println(hasCycle(head));

    }
}
