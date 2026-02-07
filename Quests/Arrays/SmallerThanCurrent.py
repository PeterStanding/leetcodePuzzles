class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sortedArray = sorted(nums)
        output = []

        for i in nums:
            output.append(sortedArray.index(i))
        return output
