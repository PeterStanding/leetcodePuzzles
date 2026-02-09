def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        aid = False
        output = []
        for i in range(left,right+1):
            digitList = [int(digit) for digit in str(i)]
            if 0 in digitList:
                pass
            else:
                for digit in digitList:
                    if i % digit == 0:
                        aid = True
                    else:
                        aid = False
                        break
                if aid:
                    output.append(i)
        return output