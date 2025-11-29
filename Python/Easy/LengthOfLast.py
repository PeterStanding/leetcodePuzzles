class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        curr = s.split()
        output = len(curr[-1])
        return output
