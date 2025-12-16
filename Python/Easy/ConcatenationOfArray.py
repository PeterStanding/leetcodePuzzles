class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        out = []
        for x in nums:
            out.append(x)
        for y in nums:
            out.append(y)

        return out
