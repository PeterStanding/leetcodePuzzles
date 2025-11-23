def isPalindrome(self, x: int) -> bool:
        #Converts the Int into String
        y = str(x)
        #Inverts the String
        z = y[::-1]
        #Checks to see if they are Identical
        if y == z:
            return True
        else:
            return False
