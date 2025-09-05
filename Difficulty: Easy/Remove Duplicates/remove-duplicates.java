// User function Template for Java

class Solution {
    String removeDups(String s) {
        if(s == null || s.isEmpty()) return s;
        
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        
        for(char c : s.toCharArray()){
            if(!seen[c]){
                result.append(c);
                seen[c] = true;
            }
        }
        return result.toString();
    }
}