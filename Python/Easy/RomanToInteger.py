
#Code created by LeetCode user 'Arpit Yadav' on Jul 21 2025
#Adaptation of the map functions
#If Current value is less than the next value, subtract it
#else add the value on
class Solution:
    def romanToInt(self, s: str) -> int:
        numerals = {'I':1,  'V':5,      'X':10,
                    'L':50, 'C':100,    'D':500,
                    'M':1000}
        total = 0

        for i in range(len(s)):
            curr = numerals[s[i]]
            next_value = numerals[s[i+1]] if i+1 < len(s) else 0

            if curr < next_value:
                total -= curr
            else:
                total += curr
        return total
