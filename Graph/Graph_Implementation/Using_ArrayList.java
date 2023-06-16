package Graph.Graph_Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Using_ArrayList {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> Graph[]){
        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<Edge>();
        }

        Graph[0].add(new Edge(0, 2, 1));
        Graph[1].add(new Edge(1, 2, 4));
        Graph[1].add(new Edge(1, 3, 2));
        Graph[2].add(new Edge(2, 0, 1));
        Graph[2].add(new Edge(2, 1, 4));
        Graph[2].add(new Edge(2, 3, 2));
        Graph[3].add(new Edge(3, 2, 2));
        Graph[3].add(new Edge(3, 1, 2));
    }

    public static void BFS(ArrayList<Edge> Graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[V];

        q.add(0);
        while(!q.isEmpty()){
            int n = q.remove();
            if(vist[n]==false){
                System.out.print(n+" ");
                vist[n] = true;

                for(int i=0;i<Graph[n].size();i++){
                    Edge e = Graph[n].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge> Graph[], int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0;i<Graph[curr].size();i++){
            Edge e = Graph[curr].get(i);
            if(vis[e.dest]==false){
                DFS(Graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        createGraph(Graph);

        boolean vis[] = new boolean[V];

//        BFS(Graph, V);
        DFS(Graph, 0, vis);

    }
}
