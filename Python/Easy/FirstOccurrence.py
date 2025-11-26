class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        out = 0
        if (haystack.find(needle) > -1):
            out = haystack.find(needle)
        else:
            out = -1
        return out
