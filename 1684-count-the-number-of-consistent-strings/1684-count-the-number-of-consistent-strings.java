class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char x: allowed.toCharArray()) mp.put(x,1);
        for(String w: words) {
            Boolean isConsistent = true;
            for(char x: w.toCharArray()) {
                if(mp.containsKey(x)==false) isConsistent = false;
            }
            if(isConsistent) count++;
        }
        return count;
    }
}