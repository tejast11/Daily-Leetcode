/*
    Solution for question 888. on leet code
        1. Brute Force
        2. Binary Search
*/
package Day0;
import java.util.Arrays;
// 1.
class Solution1 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sA = 0;
        int sB = 0;
        for(int i : aliceSizes) sA += i;
        for(int j : bobSizes) sB += j;

        int dif = (sA-sB)/2;
        for(int i = 0; i<aliceSizes.length ; i++){
            for(int j = 0 ; j<bobSizes.length ; j++){
                if(aliceSizes[i]-bobSizes[j] == dif){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

// 2.
class Solution2 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sA = 0, sB = 0;
        for(int i : aliceSizes) sA += i;
        for(int j : bobSizes) sB += j;
        int dif = (sA - sB)/2;

        Arrays.sort(aliceSizes);
        for(int y : bobSizes){
            int target = y + dif;
            if(bsBoth(aliceSizes,target)){
                return new int[]{target , y};
            }
        }
        return new int[]{-1,-1};
    }
    static boolean bsBoth(int[] a , int target){
        int s = 0;
        int e = a.length-1;

        while(s <= e){
            int m = s + (e-s)/2;
            if(a[m] == target){
                return true;
            }
            if(a[m]>target){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return false;
    }
}