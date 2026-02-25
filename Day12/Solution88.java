package Day12;

// Leetcode 88. Search in roated sorted array
public class Solution88 {
    // 5ms solution
    // public static boolean search(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int s = 0;
    //     int e = nums.length-1;
    //     while(s<=e){
    //         int mid = s + (e-s)/2;

    //         if(nums[mid] == target) return true;
    //         if(nums[mid] > target) e = mid - 1;
    //         else s = mid + 1;
    //     }
    //     return false;
    // }


    // 0ms Solution
    public static boolean search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[s]==nums[mid] && nums[e]==nums[mid]){
                s++;
                e--;
            }else if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return false;
    }
}
