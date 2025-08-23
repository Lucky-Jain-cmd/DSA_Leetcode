import java.util.*;

class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Precompute prefix sum for efficient area calculation
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = grid[i - 1][j - 1] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }
        
        int minSum = Integer.MAX_VALUE;
        
        // Try all possible ways to split into 3 rectangles
        // Case 1: Three horizontal splits
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int area1 = getMinRectangleArea(prefix, 0, i, 0, n - 1);
                int area2 = getMinRectangleArea(prefix, i + 1, j, 0, n - 1);
                int area3 = getMinRectangleArea(prefix, j + 1, m - 1, 0, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
            }
        }
        
        // Case 2: Three vertical splits
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area1 = getMinRectangleArea(prefix, 0, m - 1, 0, i);
                int area2 = getMinRectangleArea(prefix, 0, m - 1, i + 1, j);
                int area3 = getMinRectangleArea(prefix, 0, m - 1, j + 1, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
            }
        }
        
        // Case 3: One horizontal split and one vertical split
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Top left rectangle
                int area1 = getMinRectangleArea(prefix, 0, i, 0, j);
                // Top right rectangle
                int area2 = getMinRectangleArea(prefix, 0, i, j + 1, n - 1);
                // Bottom rectangle (covers both left and right)
                int area3 = getMinRectangleArea(prefix, i + 1, m - 1, 0, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
                
                // Left rectangle (covers top and bottom)
                area1 = getMinRectangleArea(prefix, 0, i, 0, j);
                // Right rectangle (covers top and bottom)
                area2 = getMinRectangleArea(prefix, i + 1, m - 1, 0, j);
                // Bottom right rectangle
                area3 = getMinRectangleArea(prefix, 0, m - 1, j + 1, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
            }
        }
        
        // Case 4: One vertical split and one horizontal split (other orientation)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Top rectangle
                int area1 = getMinRectangleArea(prefix, 0, i, 0, n - 1);
                // Bottom left rectangle
                int area2 = getMinRectangleArea(prefix, i + 1, m - 1, 0, j);
                // Bottom right rectangle
                int area3 = getMinRectangleArea(prefix, i + 1, m - 1, j + 1, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
                
                // Left rectangle
                area1 = getMinRectangleArea(prefix, 0, m - 1, 0, j);
                // Top right rectangle
                area2 = getMinRectangleArea(prefix, 0, i, j + 1, n - 1);
                // Bottom right rectangle
                area3 = getMinRectangleArea(prefix, i + 1, m - 1, j + 1, n - 1);
                if (area1 > 0 && area2 > 0 && area3 > 0) {
                    minSum = Math.min(minSum, area1 + area2 + area3);
                }
            }
        }
        
        return minSum;
    }
    
    private int getMinRectangleArea(int[][] prefix, int r1, int r2, int c1, int c2) {
        if (r1 > r2 || c1 > c2) return 0;
        
        // Check if there are any 1's in this region
        int ones = prefix[r2 + 1][c2 + 1] - prefix[r1][c2 + 1] - prefix[r2 + 1][c1] + prefix[r1][c1];
        if (ones == 0) return 0;
        
        // Find the minimum bounding rectangle that contains all 1's in this region
        int minR = Integer.MAX_VALUE, maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE, maxC = Integer.MIN_VALUE;
        
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (prefix[i + 1][j + 1] - prefix[i][j + 1] - prefix[i + 1][j] + prefix[i][j] > 0) {
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }
        
        if (minR == Integer.MAX_VALUE) return 0;
        return (maxR - minR + 1) * (maxC - minC + 1);
    }
}

