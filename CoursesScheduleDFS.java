import java.util.*;

public class CoursesScheduleDFS {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Step 1: Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]); // pre[1] -> pre[0]
        }

        // Step 2: Visited state array
        int[] visited = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        // Step 3: DFS each course
        for (int i = 0; i < numCourses; i++) {
            if (dfs(graph, visited, i)) {
                return false; // cycle found
            }
        }
        return true; // no cycle
    }

    // Returns true if cycle detected
    private boolean dfs(List<List<Integer>> graph, int[] visited, int course) {
        if (visited[course] == 1) return true;  // cycle
        if (visited[course] == 2) return false; // already processed

        visited[course] = 1; // mark as visiting

        for (int next : graph.get(course)) {
            if (dfs(graph, visited, next)) {
                return true; // cycle found
            }
        }

        visited[course] = 2; // mark as fully visited
        return false;
    }

    // 🔹 Main method to run program
    public static void main(String[] args) {
        CoursesScheduleDFS cs = new CoursesScheduleDFS();

        int numCourses1 = 2;
        int[][] prerequisites1 = {{1,0}};
        System.out.println(cs.canFinish(numCourses1, prerequisites1)); 
        // Expected: true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1,0},{0,1}};
        System.out.println(cs.canFinish(numCourses2, prerequisites2)); 
        // Expected: false
    }
}
