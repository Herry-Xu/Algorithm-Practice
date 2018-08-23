import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Hashtable<Integer, Integer> checker = new Hashtable<>();
        for (int i = 0; i < nums.length; i++){
            if (checker.containsKey(target - nums[i])){
                result[0] = checker.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            checker.put(nums[i], i);
        }
        return result;
    }
}