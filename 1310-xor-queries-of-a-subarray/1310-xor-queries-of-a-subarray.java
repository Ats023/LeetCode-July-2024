class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] pref = new int[arr.length+1];
        int[] xorQueries = new int[queries.length];
        pref[0] = 0;
        for(int i=1; i<=arr.length; i++) pref[i]=pref[i-1]^arr[i-1];
        for(int i=0; i<queries.length; i++) {
            xorQueries[i] = pref[queries[i][1]+1]^pref[queries[i][0]];
        }
        return xorQueries;
    }
}