class Solution {
    
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++){
                System.out.println(i);
                int offset = i - first;
                int top = matrix[first][i];
                //left to top
                matrix[first][i] = matrix[last - offset][first];
                //bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];
                //right to bottom
                matrix[last][last - offset] = matrix[i][last];
                //top to right
                matrix[i][last] = top;
            }
        }
    }
}
