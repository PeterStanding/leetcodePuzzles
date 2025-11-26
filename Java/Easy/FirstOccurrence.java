class Solution {
    public int strStr(String haystack, String needle) {
        int out = 0;

        if (haystack.indexOf(needle) > -1){
            out = haystack.indexOf(needle);
        } else {
            out = -1;
        }
        return out;
    }
}
