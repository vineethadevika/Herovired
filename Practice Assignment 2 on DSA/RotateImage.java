class Solution {
    public void rotate(int[][] matrix) {
        for (int start = 0, end = matrix.length - 1; start < end; start++, end--) {
            for (int s = start, e = end; s < end; s++,e--) {
                int t = matrix[start][s];
                matrix[start][s] = matrix[e][start];
                matrix[e][start] = matrix[end][e];
                matrix[end][e] = matrix[s][end];
                matrix[s][end] = t;
            }
        }
    }
}