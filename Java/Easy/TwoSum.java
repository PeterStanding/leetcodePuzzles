public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
      int[] output = new int[2];

      int start = 0, next = 0, count = 0;

      for (int i : nums){
          start = i;

          for (int j = count + 1; j < nums.length; j++){
              if (start + nums[j] == target){
                  output[0] = count;
                  output[1] = j;
              }
          }
          count++;
      }
      return output;
  }
}
