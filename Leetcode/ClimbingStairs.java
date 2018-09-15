class Solution {
    public int climbAllStairs(int n, int[] arr){
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        if (arr[n] > -1){
            return arr[n];
        }
        arr[n] = climbAllStairs(n-1, arr) + climbAllStairs(n-2, arr);
        return arr[n];
    }
    
    public int climbStairs(int n) {
        int[] result = new int[n+1];
        Arrays.fill(result, -1);
        climbAllStairs(n, result);
        return result[n];
    }
}
