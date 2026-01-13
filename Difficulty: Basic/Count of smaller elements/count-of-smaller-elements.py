#User function Template for python3

class Solution:
    def countOfElements(self, x, arr):
        result = 0
        for i in arr:
            if i<=x:
                result += 1
        return result

