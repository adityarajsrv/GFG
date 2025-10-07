class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        if(n==0 || n==1) return 1;
        int result = n * factorial(n-1);
        return result;
    }
}
