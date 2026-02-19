package Graph;

import java.util.*;

class allPossiblePathsfromSrcToTarget {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int paths[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int f[] : paths) {
            int src = f[0], dest = f[1];
            graph[src].add(new Edge(src, dest));
        }
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, int target, String path) {

        if (curr == target) {
            System.out.println(path);
            return;
        }

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                printAllPath(graph, vis, e.dest, target, path + e.dest);
            }
        }

        vis[curr] = false; // backtracking
    }

    public static void main(String args[]) {
        int n = 5;
        int paths[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }, { 3, 4 } };
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, paths);
        printAllPath(graph, new boolean[n], 0, 4, "0");
    }
}