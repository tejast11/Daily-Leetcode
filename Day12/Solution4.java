package Day12;

public class Solution4 {
    // Leetcode 4. Median of two sorted arrays

    // Common logic approach.
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int[] merged = new int[nums1.length+nums2.length];
    //     System.arraycopy(nums1, 0, merged, 0, nums1.length);
    //     System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
    //     Arrays.sort(merged);

    //     int len = merged.length-1;
    //     if(merged.length%2 == 1){
    //         return (double) merged[len/2]; 
    //     }else{
    //         return (double) (merged[len/2]+merged[(len/2)+1])/2;
    //     }
    // }


    // Binary search approach
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int len = nums1.length + nums2.length;
    //     int[] merged = new int[len];

    //     System.arraycopy(nums1, 0, merged, 0, nums1.length);
    //     System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
    //     Arrays.sort(merged);

    //     int s = 0;
    //     int e = merged.length-1;
    //     while(s<=e){
    //         int mid = s + (e-s)/2;
    //         if(merged.length%2 == 1){
    //             return merged[mid];
    //         }else{
    //             s++;
    //             e--;
    //         }
    //     }
    //     return (double) (merged[s]+merged[e])/2;
    // }

    // Without using built in methods, which is merge sorting the array.
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] merged = mergeSort(nums1, nums2);
        int len = merged.length-1;
        if(len%2 == 0){
            return (double) merged[len/2];
        }
        return (double) (merged[len/2]+merged[(len/2)+1])/2;
    }
    public static int[] mergeSort(int[] nums1 , int[] nums2){
        int i = 0;
        int j = 0;

        int[] merged = new int[nums1.length+nums2.length];
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            merged[k] = nums2[j];
            j++;
            k++;
        }
        return merged;
    }
}
