class Solution {
    public boolean isAnagram(String s, String t) {
        boolean out = false;

        char[] temp = s.toCharArray();
        char[] other = t.toCharArray();

        Arrays.sort(temp);
        Arrays.sort(other);

        if (Arrays.equals(temp, other)){
            out = true;
        }

        return out;
    }
}
