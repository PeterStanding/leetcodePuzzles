class Solution:
    def scoreOfString(self, s: str) -> int:
        total = 0
        for i in range(len(s)-1):
            curr, next = ord(s[i]), ord(s[i + 1])   
            diff = abs(curr - next)
            total += diff
        return total