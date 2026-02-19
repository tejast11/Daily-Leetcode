package Day6;

// Leetcode 868. Binary Gap
public class Solution868 {
    // Solution 1 using method .toBinaryString
    /*public static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                int next = findNext(i, binary);
                if (next != -1) {
                max = Math.max(max, next - i);
                }
            }
        }
        return max;
    }

    static int findNext(int s, String str) {
        for (int i = s + 1; i < str.length(); i++) {
            if (str.charAt(i) == '1') return i;
        }
        return -1;
    }*/

    //Solution 2 More simplified and clean approach
    /*public static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int max = 0;
        int prev = -1;

        for(int i = 0 ; i<binary.length() ; i++){
            if(binary.charAt(i) == '1'){
                if(prev != -1){
                    max = Math.max(max , i-prev);
                }
                prev = i;
            }
        }
        return max;        
    }*/

    
    // Solution 3 main bit manipulation solution
    public static int binaryGap(int n) {
        int last = -1;
        int pos = 0;
        int max = 0;

        while(n>0){
            if((n&1)==1){
                if(last != -1){
                    max = Math.max(max,pos-last);
                }
                last = pos;
            }
            pos++;
            n >>= 1;
        }
        return max;      
    }
}
