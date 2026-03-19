def minimumOperations(self, nums: List[int]) -> int:
        total = 0
        for i in nums:
            if i % 3 == 0: pass
            else: total += 1
        return total