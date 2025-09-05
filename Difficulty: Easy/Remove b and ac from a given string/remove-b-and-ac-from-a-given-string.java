// User function Template for Java

class Solution {
    public String stringFilter(String s) {
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while(i<s.length()){
            if(i+1<s.length() && s.charAt(i) == 'a' && s.charAt(i+1) == 'c'){
                i += 2;
            }else if(s.charAt(i) == 'b'){
                i++;
            }else{
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}