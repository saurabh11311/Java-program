import java.util.*;

public class RottenOranges {
    static class Pair {
        int row, col, time;
        Pair(int r, int c, int t) {
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;   // grid.length[0] :- write also 
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Find all rotten oranges initially and count fresh ones
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0)); // rotten orange with time=0
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If no fresh oranges, answer is 0
        if (freshCount == 0) {
            return 0;
        }

        int ans = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        // Step 2: BFS to spread rotting
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            int r = curr.row, c = curr.col, t = curr.time;
            ans = Math.max(ans, t);

            // Explore 4 directions
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                // If it's inside the grid and fresh orange
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;   // rot it
                    freshCount--;       // one less fresh
                    q.add(new Pair(nr, nc, t + 1)); // push with +1 min
                }
            }
        }

        // Step 3: Check if all fresh oranges were rotten
        if (freshCount > 0) return -1; // return(freshCount >0 ) ? -1: ans:   
        return ans;                   // Also we can write this
    }

    public static void main(String[] args) {
        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid1)); // Output: 4

        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(orangesRotting(grid2)); // Output: -1
    }
}
