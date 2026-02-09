def generate(self, numRows: int) -> List[List[int]]:
        output = []
        for row in range(numRows):
            currLevel = [] 
            for i in range(row+1):
                if row == i or i == 0:
                    currLevel.append(1)
                else:
                    newAdd = output[row-1][i-1] + output[row-1][i]
                    currLevel.append(newAdd)
            output.append(currLevel)  
        return output  