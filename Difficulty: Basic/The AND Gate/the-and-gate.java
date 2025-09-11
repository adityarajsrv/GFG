// User function Template for Java
class Solution {
    static int andGate(int arr[], int N) {
        int result = arr[0];
        for(int i=1; i<arr.length; i++){
            result = result & arr[i];
        }
        return result;
    }
}