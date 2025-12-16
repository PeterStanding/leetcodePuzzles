class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        out = []
        for x in range(n):
            out.append(nums[x])
            out.append(nums[x+n])
        return out
