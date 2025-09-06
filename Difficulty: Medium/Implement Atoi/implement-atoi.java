

class Solution {
    public int myAtoi(String s) {
        int total = 0, i = 0, sign = 1, n = s.length();
        
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            
            if (total > Integer.MAX_VALUE / 10 || (total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            i++;
        }
        return total * sign;
    }
}