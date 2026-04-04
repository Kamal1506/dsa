/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1);
        ListNode oddtail = oddHead;
        ListNode evenHead = new ListNode(-1);
        ListNode eventail = evenHead;
        ListNode curr = head;
        int count = 1;
        while(curr != null){
            if(count%2 == 0){
                count++;
                eventail.next = curr;
                eventail = eventail.next;
            }
            else{
                count++;
                oddtail.next = curr;
                oddtail = oddtail.next;
            }
            curr = curr.next;
        }
        eventail.next = null;
        oddtail.next = evenHead.next;
        return oddHead.next;
    }
}

// https://leetcode.com/problems/odd-even-linked-list/description/
