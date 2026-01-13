#User function Template for python3
class Solution:
    def getMoreAndLess(self, arr, target):
        smaller = larger = 0
        for i in arr:
            if i>target:
                larger += 1
            elif i<target:
                smaller += 1
            elif i==target:
                larger += 1
                smaller += 1
        result = [smaller, larger]
        
        return result