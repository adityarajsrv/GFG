class Solution:
    def getSecondLargest(self, arr):
        if len(arr)<2:
            return None
            
        first = second = float('-inf')
        for i in arr:
            if i>first:
                second = first
                first = i
            elif i>second and i!=first:
                second = i
                
        if second == float('-inf'):
            return None
            
        return second