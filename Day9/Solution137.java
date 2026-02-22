package Day9;

import java.util.HashMap;
import java.util.Map;

// Leetcode 137. Single Number II
public class Solution137 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    // HashMap Solution.
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return -1;
    }
}
