package Day10;

// Leetcode 1492. The kth factor of n
public class Solution1492 {
    public int kthFactor(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return -1;
    }
}
