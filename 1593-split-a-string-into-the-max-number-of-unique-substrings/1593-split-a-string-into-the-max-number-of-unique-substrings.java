class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> list = new HashSet<>();
        return maxSplitting(list, s, 0);
    }
    
    int maxSplitting(HashSet<String> list, String s, int beg) {
        if(beg==s.length()) return 0;
        int ans = 0;
        for(int end=beg+1; end<=s.length(); end++) {
            String substr = s.substring(beg,end);
            if(!list.contains(substr)) {
                list.add(substr);
                ans = Math.max(ans, 1+maxSplitting(list,s,end));
                list.remove(substr);
            }
        }
        return ans;
    }
}