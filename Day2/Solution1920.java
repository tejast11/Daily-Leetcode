package Day2;

// Problem 1920. Build array from permutation
public class Solution1920 {
    // Solution is in the problem discription.
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
