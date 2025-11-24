import java.util.*;
class Solution {
    //My Solution that uses for loops
    public int romanToInt(String s) {
        String input = s.toLowerCase();
        int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;
        int total = 0;
        boolean twoDigit = false;
        char fDigit = '1', sDigit = '2';

        for (int value = 0; value < s.length();value++) {
            fDigit = input.charAt(value);
            if (value != (s.length()-1)){
                sDigit = input.charAt(value+1);
            }
            //Checks to see if one of the duplicates exists
            //if so then add the new amount and 'Skip' the single digit additions
            if (fDigit == 'i' && sDigit == 'v'){
                total += 4;
                twoDigit = true;
            } else if (fDigit == 'i' && sDigit == 'x'){
                total += 9;
                twoDigit = true;
            } else if (fDigit == 'x' && sDigit == 'l'){
                total += 40;
                twoDigit = true;
            } else if (fDigit == 'x' && sDigit == 'c'){
                total += 90;
                twoDigit = true;
            } else if (fDigit == 'c' && sDigit == 'd'){
                total += 400;
                twoDigit = true;
            } else if (fDigit == 'c' && sDigit == 'm'){
                total += 900;
                twoDigit = true;
            } else {
                //Checks the value of the first digit and that a double was not used before
                //If so add on the relevant amount
                if(fDigit == 'i' && !twoDigit){
                    total += i;
                } else if(fDigit == 'v' && !twoDigit){
                    total += v;
                } else if(fDigit == 'x' && !twoDigit){
                    total += x;
                } else if(fDigit == 'c' && !twoDigit){
                    total += c;
                } else if(fDigit == 'l' && !twoDigit){
                    total += l;
                } else if(fDigit == 'c' && !twoDigit){
                    total += c;
                } else if(fDigit == 'd' && !twoDigit){
                    total += d;
                } else if(fDigit == 'm' && !twoDigit){
                    total += m;
                }
                twoDigit = false;
            }
        }
        return total;
    }

    //More Streamlined Solution using Map
    //Code created by LeetCode user 'Arpit Yadav' on Jul 21 2025
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }
}
