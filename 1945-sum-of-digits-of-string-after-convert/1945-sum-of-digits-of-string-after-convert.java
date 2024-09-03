class Solution {
    public int getLucky(String s, int k) {
        String sdigits = "";
        for(char x: s.toCharArray()) {
            sdigits+=Integer.toString(x-'a'+1);
        }
        for(int i=0; i<k; i++) {
            int sum = 0;
            for(char c: sdigits.toCharArray()) sum+=c-'0';
            sdigits = Integer.toString(sum);
        }
        return Integer.parseInt(sdigits);
    }
}