package Day5;

// Leetcode 268. Missing Number
class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total=(n * (n+1))/2;
        int sum=0;
        for(int i=0;i< n;i++){
            sum += nums[i];
        }
        return total-sum;
    }
}