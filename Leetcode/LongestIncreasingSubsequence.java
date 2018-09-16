class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int[] maxArray = new int[nums.length];
        Arrays.fill(maxArray, 1);
        //i tracks the current element
        for (int i = 1; i < nums.length; i++){
            //j iterates up to one element before i
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    maxArray[i] = Math.max(maxArray[j] + 1, maxArray[i]);
                }
            }
        }
        for (int value : maxArray){
            max = Math.max(value, max);
        }
        return max;
    }
}
