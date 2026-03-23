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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int mid = (length/2)+1;
        int count = 0;
        ListNode temp1 = head;
        while(temp1 != null){
            count++;
            if(count == mid){
                head = temp1;
                head.next = temp1.next;
                break;
            }
            temp1 = temp1.next;
        }
        return head;
    }
}

// https://leetcode.com/problems/middle-of-the-linked-list/description/
