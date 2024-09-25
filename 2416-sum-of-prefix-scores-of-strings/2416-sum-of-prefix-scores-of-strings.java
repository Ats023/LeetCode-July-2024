class TrieNode {
    TrieNode[] next = new TrieNode[26];
    int count = 0;
}
class Solution {
    TrieNode root = new TrieNode();
    
    public int[] sumPrefixScores(String[] words) {
        for(String w: words) insertToTrie(w);
        int[] ans = new int[words.length];
        int i=0;
        for(String w: words) ans[i++] = countScores(w);
        return ans;
    }
    
    void insertToTrie(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()) {
            if(node.next[c-'a']==null) node.next[c-'a'] = new TrieNode();
            node.next[c-'a'].count++;
            node = node.next[c-'a'];
        }
    }
    
    int countScores(String word) {
        TrieNode node = root;
        int score = 0;
        for(char c: word.toCharArray()) {
            score+=node.next[c-'a'].count;
            node = node.next[c-'a'];
        }
        return score;
    }
}