class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = -1;   
        int maxArea = -1;

        for (int[] rect : dimensions) {
            int l = rect[0];
            int w = rect[1];
            int diagSq = l * l + w * w;
            int area = l * w;

            if (diagSq > maxDiag || (diagSq == maxDiag && area > maxArea)) {
                maxDiag = diagSq;
                maxArea = area;
            }
        }
        return maxArea;
    }
}
