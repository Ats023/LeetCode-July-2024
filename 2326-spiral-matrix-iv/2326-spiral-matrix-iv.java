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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int x=0,y=1,i=0,j=0;
        ListNode ptr = head;
        int[][] matrix = new int[m][n];
        for(int[] row: matrix) Arrays.fill(row,-1);
        while(ptr!=null) {
            // System.out.println("at position "+i+" "+j+": "+ptr.val);
            matrix[i][j] = ptr.val;
            int ii = i+x, jj = j+y;
            if(ii<0 || jj<0 || ii>=m || jj>=n || matrix[ii][jj]!=-1) {
                if(x==0 && y==1) {x=1; y=0;}
                else if(x==1 && y==0) {x=0;y=-1;}
                else if(x==0 && y==-1) {x=-1;y=0;}
                else {x=0; y=1;}
            }
            i+=x;
            j+=y;
            ptr=ptr.next;
        }
        return matrix;
    }
}



