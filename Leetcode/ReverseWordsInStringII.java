class Solution {
    public void reverseWords(char[] str) {

        int start = 0, end;
        reverse(str, 0, str.length - 1);
        
        for (int i = 0; i < str.length; i++){
            if (str[i] == ' '){
                end = i - 1;
                reverse(str, start, end);
                start = i + 1;
            }
        }
        reverse(str, start, str.length - 1);
    }
    public void reverse(char[] str, int start, int end){
        while (end > start){
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
