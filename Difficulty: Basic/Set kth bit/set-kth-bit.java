// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        return (n | (1 << k));
    }
}