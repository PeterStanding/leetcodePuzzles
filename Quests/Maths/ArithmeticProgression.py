def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        nums = sorted(arr)
        output = False
        print(nums)
        if len(nums) == 2:
            output = True
        else:
            diff = nums[1] - nums[0]
            for n in range(1, len(nums)):
                if nums[n] - nums[n-1] == diff:
                    output = True
                else:
                    output = False
                    break
        return output
