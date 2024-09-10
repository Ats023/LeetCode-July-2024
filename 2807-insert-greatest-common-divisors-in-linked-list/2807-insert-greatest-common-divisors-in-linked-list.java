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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr = head;
        while(ptr.next!=null) {
            ListNode temp = new ListNode(getGCD(ptr.val, ptr.next.val),ptr.next);
            ptr.next = temp;
            ptr=temp.next;
        }
        return head;
    }
    
    int getGCD(int x, int y) {
        int i = Math.min(x,y);
        while(i>1) {
            if(x%i==0 && y%i==0) return i;
            i--;
        }
        return 1;
    }
}