class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0, m=rolls.length, x;
        for(int y: rolls) sum+=y;
        x = mean*(m+n)-sum;
        if(x>6*n || x<1*n) return new int[0];
        int[] missingValues = new int[n];
        int rem=x%n;
        for(int i=0; i<n; i++) {
            missingValues[i]=rem<=0?x/n:x/n+1;
            rem-=1;
        }
        return missingValues;
    }
}

// sum(rolls)/(m+n) + x/(m+n) = mean

// we get x

// split x into n integers such that 1<=n<=6