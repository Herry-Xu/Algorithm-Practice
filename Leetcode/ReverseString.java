import java.util.*;
class Solution {
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder newStr = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++){
            newStr.append(stack.pop());
        }
        
        return newStr.toString();
    }
}
