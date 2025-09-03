class Solution {
    public static boolean checkPangram(String s) {
        boolean[] arr = new boolean[26];
        
        s = s.toLowerCase();
        
        for(char c : s.toCharArray()){
            if(c>='a' && c<='z'){
                arr[c - 'a'] = true;
            }
        }
        
        for(boolean b : arr){
            if(!b) return false;
        }
        return true;
    }
}