class Solution {
public:
    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int x: nums) {
            int mapped_val = 0, tens = 1, n=x;
            if(n==0) mapped_val = mapping[0];
            while(n>0) {
                int dig = n%10;
                n/=10;
                mapped_val=mapping[dig]*tens+mapped_val;
                tens*=10;
            }
            mp[x] = mapped_val;
        }
        sort(nums.begin(), nums.end(), [&](int a, int b) {
            return mp[a]<mp[b];
        });
        return nums;
    }
};



