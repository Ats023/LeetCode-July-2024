class Solution {
    public int findTheLongestSubstring(String s) {
        int pref_xor = 0, max_len = 0;
        int[] mp = new int[26];
        mp['a'-'a'] = 1;
        mp['e'-'a'] = 2;
        mp['i'-'a'] = 4;
        mp['o'-'a'] = 8;
        mp['u'-'a'] = 16;
        
        int[] idx_mp = new int[32];
        for(int i=0; i<32; i++) idx_mp[i]=-1;
        for(int i=0; i<s.length(); i++) {
            pref_xor^=mp[s.charAt(i)-'a'];
            if(idx_mp[pref_xor]==-1 && pref_xor!=0) idx_mp[pref_xor]=i;
            max_len =  Math.max(max_len, i-idx_mp[pref_xor]);
        }
        return max_len;
    }
}