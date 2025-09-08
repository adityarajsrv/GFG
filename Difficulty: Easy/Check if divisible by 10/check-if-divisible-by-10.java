class Solution {
    int isDivisibleBy10(String bin) {
        if (bin == null || bin.isEmpty()) return 0;
        
        long result = 0; 
        for (char c : bin.toCharArray()) {
            if (c != '0' && c != '1') return 0;
            result = (result << 1) | (c - '0'); 
            result %= 10; 
        }
        
        return result == 0 ? 1 : 0; 
    }
}