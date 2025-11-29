class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = {}
        out = loop = 0
        for i in nums:
            if i in count:
                count[i] += 1
            else:
                count.update({i : 1})

        for y in count.keys():
            if count.get(y) > loop:
                out = y
                loop = count.get(y)
        return out
