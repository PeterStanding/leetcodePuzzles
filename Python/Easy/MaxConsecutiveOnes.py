class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c = h = 0
        for x in nums:
            if (x == 1):
                c+=1
            else:
                if (c > h):
                    h = c
                c = 0
        return max(h,c)
