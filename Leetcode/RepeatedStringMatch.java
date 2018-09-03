class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder newStr = new StringBuilder();
        int counter = 0;
        while (newStr.length() < B.length()){
            newStr.append(A);
            counter++;
        }
        if (newStr.toString().contains(B)) return counter;
        newStr.append(A);
        counter++;
        if (newStr.toString().contains(B)) return counter;

        return -1;
    }
}
