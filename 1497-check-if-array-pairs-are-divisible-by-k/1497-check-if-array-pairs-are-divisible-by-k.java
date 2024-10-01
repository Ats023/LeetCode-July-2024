class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> remCount = new HashMap<>();
        for (int num : arr) {
            int rem = ((num%k)+k)%k;
            remCount.put(rem, remCount.getOrDefault(rem,0)+1);
        }
        for (int num : arr) {
            int rem = ((num%k)+k)%k;
            if (rem == 0) {
                if (remCount.get(rem)%2==1) return false;
            }
            else if (!Objects.equals(remCount.get(rem), remCount.get(k-rem))) return false;
        }
        return true;
    }
}