class Solution {
    public boolean isValid(String s) {
        boolean out = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length();i++){
            //Adds element to the top of the stack
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()){
                    return false;
                }
                if (s.charAt(i) == ')' && stack.peek() == '(' ||
                    s.charAt(i) == ']' && stack.peek() == '[' ||
                    s.charAt(i) == '}' && stack.peek() == '{' ){
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        if (stack.empty()){
            out = true;
        }
        return out;
    }
}
