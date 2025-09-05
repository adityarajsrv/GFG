class Solution {
    public int longestUniqueSubstr(String s) {
        if(s.length() == 0 || s.isEmpty()) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;   
    }
}