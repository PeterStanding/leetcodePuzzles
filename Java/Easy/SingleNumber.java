class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> holder = new HashMap<Integer, Integer>();
        int out = 0;
        for (int x : nums){
            if (holder.containsKey(x)){
                holder.put(x,holder.get(x)+1);
            } else {
                holder.put(x,1);
            }
        }
        for (int y : holder.keySet()){
            if (holder.get(y) == 1){
                out = y;
            }
        }
        return out;
    }
}
