#User function Template for python3

class Solution:
    #Function to return list containing first n fibonacci numbers.
    def fibonacciNumbers(self,n):
        if n == 0:
            return []
        if n == 1:
            return [0]
            
        result = [0,1]
        for i in range(2, n):
            result.append(result[i-1] + result[i-2])
        
        return result