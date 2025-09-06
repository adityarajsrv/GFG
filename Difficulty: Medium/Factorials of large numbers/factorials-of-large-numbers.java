// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
       ArrayList<Integer> digit = new ArrayList<>();
       
       if(n<0) return digit;
       
       String result = fact(n);
       
       for(char c : result.toCharArray()){
           digit.add(Character.getNumericValue(c));
        }
       
       return digit;
    }
    
    static String fact(int n){
        if(n == 1 || n == 0){
            return "1";
        }
        
        java.math.BigInteger fact = java.math.BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(java.math.BigInteger.valueOf(i));
        }
        
        return fact.toString();
    }
}