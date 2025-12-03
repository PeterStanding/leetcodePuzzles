class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        out = False
        x = sorted(s)
        y = sorted(t)

        if (x == y):
            out = True

        return out
