class Solution {
    public boolean isValid(String s) {
        String[] arr = s.split("\\.",-1);
        if(arr.length != 4) return false;
        
        for(String i : arr){
            if(i.length() == 0) return false;
            
            if(i.length() > 1 && i.charAt(0) == '0') return false;
            
            for(char j : i.toCharArray()){
                if(!Character.isDigit(j)) return false;
            }
            
            int num = Integer.parseInt(i);
            if(num < 0 || num > 255) return false;
        }
        return true;
    }
}