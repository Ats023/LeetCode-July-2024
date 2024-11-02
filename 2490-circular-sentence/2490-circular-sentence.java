class Solution {
    public boolean isCircularSentence(String sentence) {
        char first = sentence.charAt(0);
        for(int i=1; i<sentence.length(); i++) {
            if(i==sentence.length()-1) return sentence.charAt(i)==first;
            if(sentence.charAt(i)==' ' && sentence.charAt(i-1)!=sentence.charAt(i+1)) return false; 
        }
        return true;
    }
}