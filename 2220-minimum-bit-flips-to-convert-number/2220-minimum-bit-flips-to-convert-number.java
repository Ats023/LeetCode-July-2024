class Solution {
    public int minBitFlips(int start, int goal) {
        int bitFlipPos = start^goal, count = 0;
        while(bitFlipPos>0) {
            count+=bitFlipPos&1;
            bitFlipPos>>=1;
        }
        return count;
    }
}
