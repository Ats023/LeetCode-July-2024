class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(String x: arr) {
            if(mp.containsKey(x)) mp.put(x, mp.get(x)+1);
            else mp.put(x,1);
        }
        for(int i=0; i<arr.length; i++) {
            if(mp.get(arr[i])>1) continue;
            if(--k==0) return arr[i];  
        }
        return "";
    }
}