package com.trinhtien2212;

import com.trinhtien2212.TreeProblems.ListNode;

public class StartCycleLinkedList {

    public static ListNode findCycleStart(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        int lengthCycle = 0;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                lengthCycle = calculateLength(slow);
                break;
            }
        }
        return findStartCycleLinkedList(head, lengthCycle);
    }
    public static int calculateLength(ListNode slow) {
        int count = 0;
        ListNode current = slow;
        do{
            count++;
            current = current.next;
        }while (current != slow);
        return count;
    }
    public static ListNode findStartCycleLinkedList(ListNode head, int lengthCycle) {
        if(lengthCycle == 0) return null;
        if (head == null) return null;
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(lengthCycle >0){
            lengthCycle--;
            pointer1 = pointer1.next;
        }
        while (pointer1 != pointer2){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode curr = head;
        curr.next = new ListNode(2);
        curr = curr.next;
        ListNode cycle = curr;
        curr.next = new ListNode(0);
        curr = curr.next;
        curr.next = new ListNode(4);
        curr = curr.next;
        curr.next = cycle;
        System.out.println(findCycleStart(head));
    }
}
