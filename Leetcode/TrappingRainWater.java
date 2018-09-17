class Solution {
    //O(n) solution for time and space
    public int trap(int[] height) {
        int[] rightMax = new int[height.length];
        int[] leftMax = new int[height.length];
        int currentMaxLeft = 0, currentMaxRight = 0;
        int total = 0;
        for (int i = 0; i < height.length; i++){
            int revIndex = height.length - i - 1;
            leftMax[i] = currentMaxLeft;
            rightMax[revIndex] = currentMaxRight;
            if (height[i] > currentMaxLeft){
                currentMaxLeft = height[i];
            }
            if (height[revIndex] > currentMaxRight){
                currentMaxRight = height[revIndex];
            }
        }
        for (int i = 0; i < height.length; i++){
            if (height[i] >= leftMax[i] || height[i] >= rightMax[i]){
                continue;
            }
            else {
                total += Math.min(leftMax[i], rightMax[i]) - height[i];
            }
        }
        return total;
    }
}
