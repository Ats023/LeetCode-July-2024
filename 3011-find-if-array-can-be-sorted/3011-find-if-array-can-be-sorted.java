class Solution {
    public boolean canSortArray(int[] nums) {
        int secMax = nums[0], secMin = nums[0], prevSecMax = Integer.MIN_VALUE, secBits = Integer.bitCount(nums[0]);
        for(int i=1; i<nums.length; i++) {
            if(Integer.bitCount(nums[i])==secBits) {
                secMax = Math.max(secMax, nums[i]);
                secMin = Math.min(secMin, nums[i]);
            }
            else {
                if(secMin<prevSecMax) return false;
                prevSecMax = secMax;
                secMax = nums[i];
                secMin = nums[i];
                secBits = Integer.bitCount(nums[i]);
            }
            if(secMin<prevSecMax) return false;
        }
        return true;
    }
}
