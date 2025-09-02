
class Solution {
    static String longestPalindrome(String s) {
        if(s.isEmpty() || s.length() == 0) return " ";
        
        int start = 0, maxLen = 0;
        
        for(int i=0; i<s.length(); i++){
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i+1);
            
            int length = Math.max(oddLength, evenLength);
            
            if(length>maxLen){
                maxLen = length;
                start = i - (length - 1)/2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    
    private static int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}