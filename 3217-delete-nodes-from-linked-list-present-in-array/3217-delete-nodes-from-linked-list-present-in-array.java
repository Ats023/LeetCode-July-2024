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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        HashSet<Integer> mp = new HashSet<Integer>();
        for(int x: nums) mp.add(x);
        ListNode ptr1 = dummyHead, ptr2=head;
        while(ptr1!=null && ptr2!=null) {
            while(ptr2!=null && mp.contains(ptr2.val)) {
                ptr1.next = ptr2.next;
                ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
            if(ptr2!=null) ptr2 = ptr2.next;
        }
        return dummyHead.next;
    }
}