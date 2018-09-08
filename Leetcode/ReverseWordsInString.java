public class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        StringBuilder reversedSb = new StringBuilder();
        for (int i = strArr.length - 1 ; i >= 0; i--){
            reversedSb.append(strArr[i]);
            if (i != 0){
                reversedSb.append(" ");
            }
        }
        return reversedSb.toString();
    }
}
