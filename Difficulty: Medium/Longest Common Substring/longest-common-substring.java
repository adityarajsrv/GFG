// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int maxLen = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                String sub = s1.substring(i, j);
                if(s2.contains(sub)){
                    maxLen = Math.max(maxLen, sub.length());
                }
            }
        }
        return maxLen;
    }
}