class Solution:
    def getAlternates(self, arr):
        result = []
        for i in range(0, len(arr), 2):
            result.append(arr[i])
        
        return result