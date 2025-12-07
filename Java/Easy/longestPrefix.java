class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "", holder = "";
        int size = strs[0].length(), count = 0;
        int outputSize = 0;

        //Handles Cases of Empty or Singlar Arrays
        if (strs.length == 0){
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        //Handles Empty Strings
        for (String y : strs){
            if (y.equals("")){
                return "";
            }
        }

        for (String x : strs){
            if (count == 0){
                output = x;
                outputSize = output.length();
            } else {

                size = (outputSize > x.length()) ? x.length() : outputSize;

                for (int i = 0; i < size; i++){
                    if (x.charAt(i) == output.charAt(i)){
                        holder += output.charAt(i);
                    } else {
                        break;
                    }
                }
                outputSize = holder.length();

                if (holder.equals("")){
                    return "";
                }
                if (count == strs.length-1){
                    return holder;
                }
                holder = "";
            }
            count++;
        }
        return output;
    }
}
