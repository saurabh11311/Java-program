import java.util.*;

public class XfromY {
    static class State {
        int index, cost, countY, countRevY;
        State(int i, int c, int y, int r) {
            index = i;
            cost = c;
            countY = y;
            countRevY = r;
        }
    }

    public static int getStringFactor(String X, String Y, int S, int R) {
        String revY = new StringBuilder(Y).reverse().toString();
        int n = X.length();
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 0, 0));

        boolean[] visited = new boolean[n + 1];
        visited[0] = true;

        while (!queue.isEmpty()) {
            State curr = queue.poll();
            if (curr.index == n) {
                return curr.countY * S + curr.countRevY * R;
            }

            for (int len = 1; curr.index + len <= n; len++) {
                String sub = X.substring(curr.index, curr.index + len);

                if (Y.contains(sub)) {
                    int next = curr.index + len;
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(new State(next, curr.cost + 1, curr.countY + 1, curr.countRevY));
                    }
                }

                if (revY.contains(sub)) {
                    int next = curr.index + len;
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(new State(next, curr.cost + 1, curr.countY, curr.countRevY + 1));
                    }
                }
            }
        }

        return -1; // Impossible
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        String Y = sc.nextLine();
        int S = sc.nextInt();
        int R = sc.nextInt();

        int result = getStringFactor(X, Y, S, R);
        System.out.println(result == -1 ? "Impossible" : result);
    }
}
