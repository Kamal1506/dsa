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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode Kth = findKth(temp,k);
            if(Kth == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            ListNode nextNode = Kth.next;
            Kth.next = null;
            reverseList(temp);
            if(temp == head){
                head = Kth;
            }
            else{
                prev.next = Kth;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
    private ListNode findKth(ListNode curr, int k){
        k--;
        while(curr != null && k>0){
            k--;
            curr = curr.next;
        }
        return curr;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}

// https://leetcode.com/problems/reverse-nodes-in-k-group/
