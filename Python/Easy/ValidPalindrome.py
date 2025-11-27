class Solution:
    def isPalindrome(self, s: str) -> bool:
        #Editing the String to make it Whole and Lowercase
        y = s.lower()
        #https://www.youtube.com/watch?v=KSyjpPZ1_uY
        x = y.translate(str.maketrans('','',string.punctuation))
        #https://www.geeksforgeeks.org/python/python-remove-spaces-from-a-string/
        x = x.replace(" ","")
        #Inverts the String
        z = x[::-1]
        #Checks to see if they are Identical
        if x == z:
            return True
        else:
            return False
