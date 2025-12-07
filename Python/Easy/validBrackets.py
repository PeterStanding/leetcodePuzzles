class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for x in s:
            if (x == '(' or x == '[' or x == '{'):
                stack.append(x)
            else:
                if not stack:
                    return False
                if (x == ')' and stack[-1] == '(' or
                    x == ']' and stack[-1] == '[' or
                    x == '}' and stack[-1] == '{'):
                    print("popping")
                    stack.pop()
                else:
                    return False
        if not stack:
            return True
        else:
            return False
