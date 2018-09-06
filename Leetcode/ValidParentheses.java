class Solution {
    public boolean isValid(String s) {
        Stack<Character> checker = new Stack<>();
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                checker.push(s.charAt(i));
            }
            if (s.charAt(i) == ')'){
                if (checker.isEmpty() || checker.peek() != '('){
                    return false;
                }
                checker.pop();
            }
            if (s.charAt(i) == ']'){
                if (checker.isEmpty() || checker.peek() != '['){
                    return false;
                }
                checker.pop();
            }
            if (s.charAt(i) == '}'){
                if (checker.isEmpty() || checker.peek() != '{'){
                    return false;
                }
                checker.pop();
            }
        }
        return checker.isEmpty();
    }
}
