class Solution {
    public int compress(char[] chars) {
        int freq = 1, idx = 0;
        char currChar = chars[0];
        
        for(int i=1; i<chars.length; i++) {
            if(chars[i]==currChar) freq++;
            else {
                currChar = chars[i];
                if(freq!=1) {
                    String freq_str = String.valueOf(freq);
                    int j=0;
                    while(j<freq_str.length()) chars[++idx] = freq_str.charAt(j++);
                }
                chars[++idx] = currChar;
                freq=1;
            }
            if(i==chars.length-1) {
                if(freq!=1) {
                    String freq_str = String.valueOf(freq);
                    int j=0;
                    while(j<freq_str.length() ) chars[++idx] = freq_str.charAt(j++);
                }
            }
        }
        return idx+1;
    }
}