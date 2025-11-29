class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        int out = 0, loop = 0;
        for (int x : nums){
            if (count.containsKey(x)){
                count.put(x,count.get(x)+1);
            } else {
                count.put(x,1);
            }
        }
        for (Map.Entry<Integer,Integer> y : count.entrySet()){
            //https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
            if (y.getValue() > loop){
                out = y.getKey();
                loop = y.getValue();
            }
        }
        return out;
    }
}
