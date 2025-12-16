class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = (nums.length*2);
        int[] output = new int[size];
        int n = nums.length, y = 0;
        for (int x = 0; x < n; x++){
            output[x] = nums[x];
            output[x+n] = nums[x];
        }
        return output;
    }
}
