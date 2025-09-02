
// Cycle Detection in graph code
// import java.util.*;

// public class Classroom1 {
//     static class Edge {

//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 3));
//         // graph[3].add(new Edge(3, 0));
//     }

//     public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
//         vis[curr] = true;
//         rec[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);

//             if (rec[e.dest]) {
//                 return true;
//             } else if (!vis[e.dest]) {
//                 if (isCycleDirected(graph, vis, e.dest, rec)) {
//                     return true;
//                 }

//             }
//         }
//         rec[curr] = false;
//         return false;
//     }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 4;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);

//         // boolean vis[] = new boolean[V];
//         // boolean rec[] = new boolean[V];
//         // for (int i = 0; i < V; i++) {
//         //     if (!vis[i]) {
//         //         boolean isCycle = isCycleDirected(graph, vis, i, rec);
//         //         if (isCycle) {
//         //             System.out.println(isCycle);
//         //             break;
//         //         }

//         //     }
//         // }
//         System.out.println(isCycleDirected(graph, new boolean[V], 0, new
//         boolean[V]));
//     }
// }

//Topological sorting by graph 

// import java.util.*;

// public class Classroom1 {
//     static class Edge {

//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));

//     }

//     public static void topSortUtil(ArrayList<Edge> graph[], int curr , boolean vis[], Stack<Integer> stack){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);

//             if (!vis[e.dest]) {
//                 topSortUtil(graph, e.dest, vis, stack);
//             }
//         }
//         stack.push(curr);
//     }

//     public static void topSort(ArrayList<Edge> graph[], int V){
//         boolean vis[] = new boolean[V];
//         Stack<Integer> stack = new Stack<>();

//         for(int i=0; i<V; i++){
//             if (!vis[i]) {
//                 topSortUtil(graph, i, vis, stack);
//             }
//         }
//         while (!stack.isEmpty()) {
//             System.out.print(stack.pop()+ " ");
//         }
//     }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 6;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);

//         topSort( graph , V);
//     }
// }

// Dijkstra's Algorithms by using graph 

// import java.util.*;

// public class Classroom1 {
//     static class Edge {

//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));

//         graph[2].add(new Edge(2, 4, 3));

//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));

//     }

//     public static class Pair implements Comparable<Pair>{
//         int node;
//         int dist;

//         public Pair(int n, int d){
//             this.node = n;
//             this.dist = d;
//         }

//         @Override
//         public int compareTo(Pair p2){
//             return this.dist - p2.dist; //Ascending 
//             //return P2.dist - this.dist;  //descending order
//         }
//     }

//     // Time complexity :-  O(E + ElogV)
//     public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         int dist[] = new int[V];
//         for(int i=0; i<V; i++){
//             if (i != src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }
//         boolean vis[] = new boolean[V];

//         pq.add(new Pair(0, 0));
//         //BFS ke similer code hoga

//         while (!pq.isEmpty()) {
//             Pair curr = pq.remove();       //Shortest 
//             if (!vis[curr.node]) {
//                 vis[curr.node] = true;

//                 for(int i=0; i<graph[curr.node].size(); i++){
//                     Edge e = graph[curr.node].get(i);
//                     int u = e.src;
//                     int v = e.dest;
//                     if (dist[u] + e.wt < dist[v]) {    //Relaxation
//                         dist[v] = dist[u] + e.wt;        
//                         pq.add(new Pair(v, dist[v]));
//                     }
//                 }
//             }
//         }
//         for(int i=0; i<V; i++){
//             System.out.print(dist[i] + " ");
//         }
//         System.err.println();
//     }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 6;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);

//        dijkstra(graph, 0, V);

//     }
// }

//Bellman ford algorithms 

// import java.util.*;

// public class Classroom1 {
//     static class Edge {

//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));

//         graph[2].add(new Edge(2, 4, 3));

//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));

//     }

//     public static void bellmanFord(ArrayList<Edge> graph[], int src, int V){
//         int dist[] = new int[V];
//         for(int i=0; i<V; i++){
//             if (i!= src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         for(int k=0; k<V-1; k++){ //O(V)
//             //O(E)
//             for(int i=0; i<V; i++){
//                 for(int j=0; j<graph[i].size(); j++){
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                     if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
//                         dist[v] = dist[u] + e.wt;
//                     }
//                 }
//             }
//         }

//         for(int i=0; i<dist.length; i++){
//             System.out.print(dist[i] + " ");
//         }
//         System.out.println();
//     }
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 5;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         bellmanFord(graph, 0, V);

//     }
// }

// Minimum spanning tree 
// 1. Prim's Algorithms 

// import java.util.*;

// public class Classroom1 {
//     static class Edge {

//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1, 10));
//         graph[0].add(new Edge(0, 2, 15));
//         graph[0].add(new Edge(0, 3, 30));

//         graph[1].add(new Edge(1, 0, 10));
//         graph[1].add(new Edge(1, 3, 40));

//         graph[2].add(new Edge(2, 0, 15));
//         graph[2].add(new Edge(2, 3, 50));

//         graph[3].add(new Edge(3, 1, 40));
//         graph[3].add(new Edge(3, 2, 50));

//     }

//     public static class Pair implements Comparable<Pair> {
//         int node;
//         int cost;

//         public Pair(int n, int c) {
//             this.node = n;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Pair p2) {
//             return this.cost - p2.cost; // assecnding order
//         }
//     }

//     public static void primsAlgo(ArrayList<Edge> graph[], int V) {
//         PriorityQueue<Pair> pq = new PriorityQueue<>(); // (node - int , cost - int )
//         boolean vis[] = new boolean[V];
//         pq.add(new Pair(0, 0));

//         int mstCost = 0;

//         while (!pq.isEmpty()) {
//             Pair curr = pq.remove();
//             if (!vis[curr.node]) {
//                 vis[curr.node] = true;
//                 mstCost += curr.cost;

//                 for (int i=0; i<graph[curr.node].size(); i++) {
//                     Edge e = graph[curr.node].get(i);
//                     if (!vis[e.dest]) {
//                         pq.add(new Pair(e.dest, e.wt));
//                     }
//                 }
//             }
//         }

//         System.err.println("min cost of mst =" + mstCost );
//     }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 5;

//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         primsAlgo(graph, V);

//     }
// }

//strongly connected component 
//1. Kosaraju's Algorithms

import java.util.*;

public class Classroom1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 1));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void KosarajuAlgo(ArrayList<Edge>[] graph, int V) {
        // Step1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // step2
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            transpose[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < V; i++) {
            vis[i] = false;
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e.src(i) -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Stepp 3
        
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.println("SCC : ");
                dfs(transpose, curr, vis);
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        KosarajuAlgo(graph, V);
    }
}