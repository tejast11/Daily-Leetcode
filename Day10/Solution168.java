package Day10;


// Leetcode 168. Excel sheet column title
public class Solution168 {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            str.insert(0,(char)((columnNumber%26)+'A'));
            columnNumber /= 26;
        }
        return str.toString();
    }
}
