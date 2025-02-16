package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_sort 
{

    static class Edge
    {
        int src, dest;
        Edge(int s, int d)
        {
            this.src = s;
            this.dest = d;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));

    }

    public static void topoSort(ArrayList<Edge> graph[])
    {
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                dfs(graph,i,vis,s);
            }
        }
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr ,boolean[] vis, Stack<Integer> s)
    {
        vis[curr] = true;
        // if(vis[curr]) return;
        // System.out.print(curr + " ");

        for(int i=0; i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfs(graph, e.dest, vis, s);
            }
        }
        s.push(curr);

    }


    public static void main(String[] args) 
    {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v]; // adjacency List
        createGraph(graph);
        System.out.println("TopoLogical sort:-");
        topoSort(graph);
    }    
}


//Topological sorting for Directed Acyclic Graph
/*  aise graph where dfs not work then we use topological sort
It is a linear ordering of vertices such that for every directed Edge[U -V] 
vertex U comes before Vertex v in the ordering

Topo sorting is not possible for graph other than DAG's


            5        4
            / \    / |
           /   \  /  |
          2      0   |
           \         |
            \        |
             \       |
              3----->1



    The first vertex in topo sort is always a vertex with in n degree of 0(a vertex with no incoming in edges)
    Topological order may not be unique hence you can have multiple solution.
    Topological sort using DFS(stack)

    Algorithm:-
    Step 1:-  Create a graph with n vertices and m directed edges
    Step 2:-  Initialize a stack and a visited array.
    Step 3:-  for each un visited vertex in the graph do the following step
            3.1 call the dfs function with the vertex as the parameter
            3.2  IN THE DFS FUNCTION MARK THE VERTEX AS VISITED ANDD RECURSIVELY CALL THE DFS FUNCTION FOR ALL UN-VISITED NEIGHBOURS

            3.3 ONCE ALL THE NIIGHBOURS HAS BEEN VISITED PUSH THE VERTEX INTO THE STACK.
    Step 4:-   AFTER ALL THE VERTICES HAVE BEEN PUSH INTO THE STACK POP THE ELEMENT AND PRINT THE ANSWER




*/
