class Solution {
    public int searchInsert(int[] nums, int target) {
        int out = 0;

        if (nums.length == 1){
            if (nums[0] > target || nums[0] == target){
                out = 0;
            } else {
                out = 1;
            }
        } else {
            for (int i = 0; i <= nums.length; i++){
                if (nums[i] == target){
                    return i;
                } else if (i == nums.length - 1){
                    out = nums.length;
                    break;
                } else if (nums[i] < target && nums[i+1] > target){
                    out = i+1;
                    break;
                } else if (nums[i] > target && i == 0){
                    out = 0;
                    break;
                }
            }
        }
        return out;
    }
}
