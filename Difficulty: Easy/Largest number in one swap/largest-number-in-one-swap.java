class Solution {
    public String largestSwap(String s) {
        if(s == null || s.length() <=1) return s;
        
        char[] arr = s.toCharArray();
        int n = arr.length;
        int bestI = -1, bestJ = -1;
        int[] last = new int[10];
        
        for(int i=0; i<n; i++){
            last[arr[i] - '0'] = i;
        }
        
        for(int i=0; i<n; i++){
            int currentDigit = arr[i] - '0';
            for(int d=9; d>currentDigit; d--){
                if(last[d] > i){
                    bestI = i;
                    bestJ = last[d];
                    break;
                }
            }
            if(bestI != -1) break;
        }
        if(bestI != -1 && bestJ != -1){
            char temp = arr[bestI];
            arr[bestI] = arr[bestJ];
            arr[bestJ] = temp;
            return new String(arr);
        }
        return s;
        
    }
}