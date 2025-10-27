/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode revList = reverseList(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return revList; 
    }
}
