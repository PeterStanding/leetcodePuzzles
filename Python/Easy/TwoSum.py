class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        count = 0
        if len(nums) == 2:
            if (nums[0] + nums[1] == target):
                return [0,1]
            else:
                pass
        else:
            for i in range(len(nums)):
                for j in range(i+1, len(nums)):
                    if nums[j] + nums[i] == target:
                        return[i,j]
# Forgot that you could indent the start of the secondary loop like in Java
# Watched the LeetCode video for the Solution
