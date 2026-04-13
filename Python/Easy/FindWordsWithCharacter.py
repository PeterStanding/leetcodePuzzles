class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        output = []
        c = 0
        for i in words:
            if x in i: output.append(c)
            c += 1
        return output