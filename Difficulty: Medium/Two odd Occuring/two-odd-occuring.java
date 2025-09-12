class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        int xorAll = 0;
        for(int num : arr){
            xorAll ^= num;
        }
        
        int right = xorAll & -xorAll;
        int num1 = 0, num2 = 0;
        
        for(int num : arr){
            if((num & right) == 0){
                num1 ^= num;
            }else{
                num2 ^= num;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(num1 > num2){
            result.add(num1);
            result.add(num2);
        }else{
            result.add(num2);
            result.add(num1);
        }
        return result;
    }
}
