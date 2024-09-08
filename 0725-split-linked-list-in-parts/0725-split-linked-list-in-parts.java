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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ptr = head;
        int listSize = 0;
        while(ptr!=null) {
            listSize++;
            ptr=ptr.next;
        } 
        ListNode[] parts = new ListNode[k];
        int rem = listSize%k, x=1, i=0;
        ptr = head;
        while(ptr!=null) {
            if(x==1) parts[i++]=ptr;
            if(x==listSize/k+(rem<=0?0:1)) {
                ListNode temp = ptr;
                ptr = ptr.next;
                temp.next = null;
                x=1;
                rem--;
            }
            else {
                ptr=ptr.next;
                x++;
            }
        }
        return parts;

    }
}