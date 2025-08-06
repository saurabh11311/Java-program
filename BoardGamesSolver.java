import java.util.*;

public class BoardGamesSolver {
    static class Cell {
        int row, col, moves;
        Cell(int r, int c, int m) {
            row = r;
            col = c;
            moves = m;
        }
    }

    static int[][] directions(int dx, int dy) {
        return new int[][] {
            {dx, dy},         // forward
            {dy, -dx},        // right (90° clockwise)
            {-dy, dx},        // left (90° anticlockwise)
            {-dx, -dy}        // backward (180°)
        };
    }

    public static int minMoves(int[][] grid, int[] src, int[] dest, int[] moveRule) {
        int M = grid.length, N = grid[0].length;
        boolean[][] visited = new boolean[M][N];
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(src[0], src[1], 0));
        visited[src[0]][src[1]] = true;

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            if (curr.row == dest[0] && curr.col == dest[1]) return curr.moves;

            for (int[] dir : directions(moveRule[0], moveRule[1])) {
                int newRow = curr.row + dir[0];
                int newCol = curr.col + dir[1];

                if (newRow >= 0 && newRow < M && newCol >= 0 && newCol < N &&
                    grid[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.add(new Cell(newRow, newCol, curr.moves + 1));
                }
            }
        }
        return -1; // destination unreachable
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();
        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                grid[i][j] = sc.nextInt();

        int[] src = {sc.nextInt(), sc.nextInt()};
        int[] dest = {sc.nextInt(), sc.nextInt()};
        int[] moveRule = {sc.nextInt(), sc.nextInt()};

        int result = minMoves(grid, src, dest, moveRule);
        System.out.println(result);
    }
}
