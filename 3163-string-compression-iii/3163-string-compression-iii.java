class Solution {
    public String compressedString(String word) {
        int freq = 1;
        char currChar = word.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<word.length(); i++) {
            if(word.charAt(i)==word.charAt(i-1) && freq<9) freq++;
            else {
                sb.append(String.valueOf(freq));
                sb.append(currChar);
                freq=1;
                currChar = word.charAt(i);
            }
        }
        sb.append(String.valueOf(freq));
        sb.append(currChar);
        return sb.toString();
    }
}