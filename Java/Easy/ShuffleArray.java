class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s = n*2, xJump = 0, yJump = 0;
        int[] out = new int[s];
        int[] xCoords = new int[n];
        int[] yCoords = new int[n];
        for (int y = 0; y<n;y++){
            xCoords[y] = nums[y];
            yCoords[y] = nums[n+y];
        }
        for (int x =0; x < nums.length;x++){
            if (x % 2 == 0){
                out[x] = xCoords[xJump];
                xJump++;
            } else {
                out[x] = yCoords[yJump];
                yJump++;
            }
        }
        return out;
    }
}
