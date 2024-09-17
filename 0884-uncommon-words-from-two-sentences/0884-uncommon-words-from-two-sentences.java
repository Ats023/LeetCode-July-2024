class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String total = s1+" "+s2;
        String[] words = total.split(" ");
        ArrayList<String> uncommon = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        for(String word: words) {
            if(mp.containsKey(word)) mp.put(word, mp.get(word)+1);
            else mp.put(word,1);
        }
        for(Map.Entry<String,Integer> x: mp.entrySet()) {
            if(x.getValue()==1) uncommon.add(x.getKey());
        }
        String[] ans = new String[uncommon.size()];
        ans = uncommon.toArray(ans);
        return ans;
    }
}