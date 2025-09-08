// User function Template for Java

class Solution {
    int DivisibleByEight(String s) {
        if (s == null || s.length() < 1) {
            return -1;
        }
        
        String x = s.length() >=3 ? s.substring(s.length() - 3) : s;
        
        return (Integer.parseInt(x) & 7) == 0 ? 1 : -1;
    }
}