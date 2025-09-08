// User function Template for Java
class Solution {
    static int isBitSet(int N) {
        if(N == 0) return 0;
        
        return ((N & (N+1)) == 0) ? 1 : 0;
    }
}