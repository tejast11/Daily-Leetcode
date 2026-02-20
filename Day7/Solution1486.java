package Day7;

// Leetcode 1486. Xor Operation in an Array
public class Solution1486 {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= start+2*i;
        }
        return ans;
    }
}
