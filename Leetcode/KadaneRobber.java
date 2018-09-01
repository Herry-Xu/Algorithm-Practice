import java.util.*;
class Solution {
    private Hashtable<Integer,Integer> checker = new Hashtable<>();
    
    public int rob(int[] nums) {
        // int max = 0;
        //base cases
        //normal cases
        return Math.max(helper(nums, 0, nums.length), helper(nums, 1, nums.length));
    }
    
    public int helper(int[] nums, int start, int end){

        if (end - start <= 0){
            return 0;
        }        
        else if (checker.containsKey(start)){
            return checker.get(start); 
        }
        else if (end - start == 1){
            checker.put(start, nums[start]);
        }
        else if (end - start == 2){
            checker.put(start, Math.max(nums[start], nums[start+1]));
        }
        
        checker.put(start, nums[start] + Math.max(helper(nums, start+2, end), helper(nums, start+3, end)));
        return checker.get(start);
    }
}
