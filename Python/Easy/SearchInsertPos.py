class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        out = 0
        if len(nums) == 1:
            if nums[0] > target or nums[0] == target:
                return 0
            else:
                return 1
        else:
            for i in range(len(nums)):
                if nums[i] == target:
                    return i
                elif (i == len(nums)-1):
                    return len(nums)
                    break
                elif nums[i] < target and nums[i+1] > target:
                    return i+1
                    break
                elif nums[i] > target and i == 0:
                    return 0
                    break
