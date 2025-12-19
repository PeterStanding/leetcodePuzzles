class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        holder = {}
        for i in nums:
            if i in holder:
                holder[i] += 1
            else:
                holder.update({i:1})

        for x, y in holder.items():
            if y == 1:
                return x
