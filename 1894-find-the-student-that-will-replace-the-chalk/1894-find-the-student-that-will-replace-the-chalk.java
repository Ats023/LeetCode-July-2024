class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum=0;
        for(int x: chalk) {
            sum+=x;
            if(sum>k) break;
        }
        k%=sum;
        for(int i=0; i<chalk.length; i++) {
            if(k<chalk[i]) return i;
            k-=chalk[i];
        }
        return 0;
    }
}