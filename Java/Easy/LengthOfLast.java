class Solution {
    public int lengthOfLastWord(String s) {

        String[] splitString = s.split(" ");
        String last = splitString[(splitString.length)-1];
        int output = last.length();

        return output;
    }
}
