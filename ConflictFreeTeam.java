import java.util.*;

public class ConflictFreeTeam {
    static int n;
    static int[][] conflict;
    static int[] expertise;
    static Map<Integer, Integer> memo = new HashMap<>();

    // Check if team (bitmask) is conflict-free
    static boolean isValid(int mask) {
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) == 0) continue;
            for (int j = i + 1; j < n; j++) {
                if ((mask & (1 << j)) != 0 && conflict[i][j] == 1) return false;
            }
        }
        return true;
    }

    // Calculate total expertise of team (bitmask)
    static int getExpertise(int mask) {
        if (memo.containsKey(mask)) return memo.get(mask);
        int total = 0;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0) total += expertise[i];
        }
        memo.put(mask, total);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = sc.nextInt();

        conflict = new int[n][n];
        for (int i = 0; i < c; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            conflict[u][v] = 1;
            conflict[v][u] = 1;
        }

        expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = sc.nextInt();
        }

        int maxExpertise = 0;
        for (int mask = 1; mask < (1 << n); mask++) {
            if (isValid(mask)) {
                maxExpertise = Math.max(maxExpertise, getExpertise(mask));
            }
        }

        System.out.println(maxExpertise);
    }
}
