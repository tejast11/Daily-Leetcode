package Day10;

// Leetcode 1344. Angle between hands of a clock
class Solution1344 {
    public static void main(String[] args) {
        int hour = 3;
        int minutes = 15;
        System.out.println(angleClock(hour, minutes));
    }
    public static double angleClock(int hour, int minutes) {
        double ans = Math.abs(30*hour-5.5*minutes);
        return ans < 180 ? ans : 360-ans;
    }    
}