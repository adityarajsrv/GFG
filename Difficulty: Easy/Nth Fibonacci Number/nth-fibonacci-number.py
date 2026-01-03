class Solution:
    def nthFibonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
            
        result = [0,1]
        for i in range(2, n+1):
            result.append(result[i-1] + result[i-2])
        
        return result[n]
        
