import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Solution validator = new Solution();
        String s1 = "()[]{}";
        String s2 = "([)]";
        
        System.out.println("Is " + s1 + " valid? " + validator.isValid(s1));
        System.out.println("Is " + s2 + " valid? " + validator.isValid(s2));
    }
}