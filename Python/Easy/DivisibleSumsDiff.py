class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        sum1 = sum2 = 0
        for i in range(1,n+1):
            if not i % m == 0:
                sum1 += i
            elif i % m == 0:
                sum2 += i

        return sum1 - sum2
