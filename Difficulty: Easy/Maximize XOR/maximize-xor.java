// User function Template for Java

class Solution {
    public int maximize_xor_count(int n) {
        int result=0, count=0;
        while(n!=0){
            count++;
            if( (n&1)==0 )
            result+= (1<<count)/2;
            
            n=n>>1;
        }
        
        return result;
    }
}
