class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=1; i<10; i++) {
            lexicalNumbers(i, n, ans);
        }
        return ans;
    }
    
    void lexicalNumbers(int curr, int n, ArrayList<Integer> ans) {
        if(curr>n) return;
        ans.add(curr);
        for(int j = 0; j<10; j++) {
            int num = curr*10+j;
            if(num<=n) lexicalNumbers(num,n, ans);
            else break;
        }
    }
}
    