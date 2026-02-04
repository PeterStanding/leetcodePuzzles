def pivotInteger(self, n: int) -> int:
        if n == 1:
            return 1
        total, sum, compare = 0, 0, 0
        for i in range(1, n+1):
            total += i
        halfway = total / 2
        for x in range(1, n+1):
            sum +=x
            if sum > halfway:
                for y in range(x, n+1):
                    compare += y
                if compare == sum:
                    return x
                else:
                    return -1
