class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, h = 0;

        for (int x : nums){
            if (x == 1){
                c++;
            } else {
                if (c > h){
                    h = c;
                }
                c = 0;
            }
        }
        return Math.max(h,c);
    }
}
