import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c1 : J.toCharArray()){
            set.add(c1);
        }
        for (char c1 : S.toCharArray()){
            if (set.contains(c1)){
                counter += 1;
            }
        }
        return counter;
    }
}
