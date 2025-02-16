package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {

    static class Edge
    {
        int src, dest, weight;
        Edge(int s, int d,int w)
        {
            this.src = s;
            this.dest = d;
            this.weight = w; 
        }
    }

    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));

        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,2,1));
    }


    public static void bfs(ArrayList<Edge> graph[], int v)
    {
        boolean[] vis = new boolean[4]; // visited node
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        while ((!q.isEmpty())) 
        {
            int curr  = q.remove();
            if(!vis[curr])
            {
                System.out.print(curr+ " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size();i++)
                {
                    Edge e = graph[curr].get(i);

                    if(!vis[e.dest]) q.add(e.dest);
                }
            }  
        }
    }

// Depth first search
    public static void dfs(ArrayList<Edge> graph[],int curr ,boolean[] vis)
    {
        if(vis[curr]) return;
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, vis);
        }

    }

    public static void printAllpaths(ArrayList<Edge> graph[], int src,int dest, String path,boolean[] vis )
    {
        if(src == dest)
        {
            System.out.println(path+" ");
            return;
        }
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e = graph[src].get(i);
            if(!vis[e.dest])
            {
                vis[e.dest] = true;
                printAllpaths(graph, e.dest, dest, path + e.dest, vis);
                vis[e.dest] = false;
            }
        }
    }




    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v]; // adjacency List
        createGraph(graph);
        System.out.println("Breadth first Search:-");
        bfs(graph,v);
        System.out.println("\nDepth first Search:-");
        dfs(graph,1, new boolean [v]);

        System.out.println("\nPrint all path:-");
        boolean[] vis = new boolean[v];
        vis[0] = true;
        printAllpaths(graph, 0, 2, "0", vis);
    }
    
}
