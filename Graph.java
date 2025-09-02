// import java.util.*;

// public class Graph {
//     static class Edge {
    
//         int src;
//         int dest;

//         public Edge(int s, int d){
//             this.src =s;
//             this.dest =d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for(int i=0; i<graph.length; i++){
//             graph[i]= new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 2));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 3));
            
        
//     }
    
//     public static void main(String[] args) {
//         int V = 4;

//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
        
//         //print 2's neighbour
//         for(int i= 0; i<graph[2].size();i++){
//             Edge e = graph[2].get(i);
//             System.out.print(e.dest+" ");
//         }
        
//     }
// }

//create a graph with sourse distination and weight

// import java.util.*;

// public class Graph {
//     static class Edge {
    
//         int src;
//         int dest;
//         int wt;


//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }

//         public Edge(int s, int d, int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for(int i=0; i<graph.length; i++){
//             graph[i]= new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2, 2));

//         graph[1].add(new Edge(1, 2,10));
//         graph[1].add(new Edge(1, 3,0));

//         graph[2].add(new Edge(2, 0,2));
//         graph[2].add(new Edge(2, 1,10));
//         graph[2].add(new Edge(2, 3,-1));

//         graph[3].add(new Edge(3, 1, 0));
//         graph[3].add(new Edge(3, 3, 1));
            
        
//     }
    
//     public static void main(String[] args) {
//         int V = 4;

//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
        
//         //print 2's neighbour
//         for(int i= 0; i<graph[2].size();i++){
//             Edge e = graph[2].get(i);
//             System.out.println(e.dest + "," + e.wt);
//         }
        
//     }
// }


//Graph travesal in the java programming language

// import java.util.*;

// public class Graph {
//     static class Edge {
    
//         int src;
//         int dest;
       

//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }

//         // public Edge(int s, int d, int w){
//         //     this.src = s;
//         //     this.dest = d;
//         //     // If you want to use weight, add: this.wt = w;
//         // }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++){
//             graph[i]= new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
        
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 5));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));
      
            
        
//     }

//     public static void bfs(ArrayList<Edge> graph[], int V){
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[V];
//         q.add(0);

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.print(curr + " ");
//                 vis[curr]= true;

//                 for(int i=0; i<graph[curr].size(); i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
    
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         int V = 7;

//         /*    1--- 3
//              /    | \ 
//             0     |  5 -- 6
//              \    |  /
//               2 --4
//          */
       
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
        
//         // //print 2's neighbour
//         // for(int i= 0; i<graph[2].size();i++){
//         //     Edge e = graph[2].get(i);
//         //     System.out.println(e.dest );
//         // }

//         bfs(graph, V);
//         System.out.println();
        
//     }
// }


/*
For the Disconnected graph of code 
*/ 


// import java.util.*;

// public class Graph {
//     static class Edge {
    
//         int src;
//         int dest;
       

//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }

//         // public Edge(int s, int d, int w){
//         //     this.src = s;
//         //     this.dest = d;
//         //     // If you want to use weight, add: this.wt = w;
//         // }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++){
//             graph[i]= new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
        
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 5));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));
      
            
        
//     }

//     public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start){
//         Queue<Integer> q = new LinkedList<>();
        
//         q.add(start);

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.print(curr + " ");
//                 vis[curr]= true;

//                 for(int i=0; i<graph[curr].size(); i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
    
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {   //o(V + E)
//         int V = 7;

//         /*    1--- 3
//              /    | \ 
//             0     |  5 -- 6
//              \    |  /
//               2 --4
//          */
       
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
        
//         // //print 2's neighbour
//         // for(int i= 0; i<graph[2].size();i++){
//         //     Edge e = graph[2].get(i);
//         //     System.out.println(e.dest );
//         // }

//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++){
//             if (vis[i] == false) {
//                 bfs(graph, V, vis, i);
//             }
//         }
        
//         System.out.println();
        
//     }
// }


/*
 DSF Depth First Search  vea code 
 */

// 

//All the path from source to target 

import java.util.*;

public class Graph {
    static class Edge {
    
        int src;
        int dest;
       

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }

      
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
      
            
        
    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr]= true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    //DSF ke liye Function //Normal DSF ke liye code  
    // Time complexity is O(V+E)
    public static void dfs(ArrayList<Edge> graph[] , int curr , boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

  //Print all path ke liye code  
  // Time complexity is O(v^v)
  //Modified DFS ka code bolenge 
    public static void printaAllPath(ArrayList<Edge> graph[] , boolean vis[], int curr , String path , int tar){

        if (curr == tar) {              //Modification base case change 
            System.err.println(path);  //path ko print and track 
            return;
        }
        for(int i=0 ; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;   //jab vis ko call lagani hai tabhi true hoga 
                printaAllPath(graph , vis , e.dest , path + e.dest , tar);
                vis[curr]=false;  // dobara se vapas aaane par visited false ho jayegaa
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {   //o(V + E)
        int V = 7;

        /*    1--- 3
             /    | \ 
            0     |  5 -- 6
             \    |  /
              2 --4
         */
       
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0 , tar = 5;
        printaAllPath(graph, new boolean[V], src, "0", tar);
       

     
    }
}

