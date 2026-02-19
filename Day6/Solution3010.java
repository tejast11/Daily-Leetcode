package Day6;

// Leetcode 3010. Divide an array into subarrays with minimum cost i
/*
    Question is sloved when you realise that Element at nums[0] would be added to every solution.
    And then you have to just find other 2 minimums int nums in range 1 to n. Adding up those 3 is the solution. 
*/
public class Solution3010 {
    public static int minimumCost(int[] nums) {
        int ans = nums[0];
        int temp = findOther2Mins(nums);

        return ans+temp;
    }
    static int findOther2Mins(int[] nums){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] < min){
                secondMin = min;
                min = nums[i];
            }else if(nums[i]<secondMin && nums[i]>=min){
                secondMin = nums[i];
            }
        }
        return (secondMin != Integer.MAX_VALUE) ? (min+secondMin) : -1;
    }
}
