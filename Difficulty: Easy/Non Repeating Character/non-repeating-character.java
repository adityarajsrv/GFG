class Solution {
    public char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
