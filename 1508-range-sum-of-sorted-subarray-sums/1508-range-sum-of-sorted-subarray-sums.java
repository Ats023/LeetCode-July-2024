class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        // Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int subArraySum = 0;
            for(int j=i; j<nums.length; j++) {
                subArraySum+=nums[j];
                res.add(subArraySum);
            }
        }
        Collections.sort(res);
        int totalRangeSum = 0;
        for(int i=left-1; i<right; i++) {
            totalRangeSum=(totalRangeSum+res.get(i))%(1000000007);
        }
        return totalRangeSum;
    }
}