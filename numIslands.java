public class numIslands {
    public static void main(String[] args) {
        // Example test case
        // char[][] grid = {
        //     {'1','1','1','1','0'},
        //     {'1','1','0','1','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','0','0','0'}
        // };

          char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        
        Solution sol = new Solution();
        int result = sol.numIslands(grid);

        System.out.println("Number of islands: " + result);
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length ||
            c < 0 || c >= grid[0].length ||
            grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0'; // mark as visited

        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }
}
