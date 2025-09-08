// User function Template for Java
class Solution {
    static String onesComplement(String S, int N) {
        StringBuilder result = new StringBuilder();
        
        for(char c : S.toCharArray()){
            if(c == '0'){
                result.append('1');
            }else{
                result.append('0');
            }
        }
        return result.toString();
    }
}