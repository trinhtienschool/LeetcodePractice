package com.trinhtien2212;


import com.trinhtien2212.TreeProblems.ListNode;

public class LengthCycleLinkedList {
    //find the length of loop/cycle linked list
    public static int findLengthCycleLinkedList(ListNode head) {
        if (head == null) return 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return calculateLength(slow);
            }
        }
        return 0;
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
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode curr = head;
        curr.next = new ListNode(2);
        curr = curr.next;
        curr.next = new ListNode(3);
        curr = curr.next;
        ListNode cycle = curr;
        curr.next = new ListNode(4);
        curr = curr.next;
        curr.next = cycle;
        System.out.println(findLengthCycleLinkedList(head));
    }
}
