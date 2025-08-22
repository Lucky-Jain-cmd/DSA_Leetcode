class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int Minrows = rows;
        int Mincol = columns;
        int max_rows = -1;
        int max_columns = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    Minrows = Math.min(Minrows, i);
                    max_rows = Math.max(max_rows, i);
                    Mincol = Math.min(Mincol, j);
                    max_columns = Math.max(max_columns, j);

                }
            }
        }
        if(max_rows==-1) return 0;
        int l = max_rows - Minrows  + 1;
        int b = max_columns - Mincol + 1;
        return l*b;
    }
}