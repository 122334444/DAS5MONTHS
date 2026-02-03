package Graph;

import java.util.*;

public class bfs {

    public static ArrayList<Integer> bfsGraph(int n, ArrayList<Integer> graph[]) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int dest : graph[node]) {
                if (!vis[dest]) {
                    vis[dest] = true;
                    q.add(dest);
                }
            }
        }
        return bfs;
    }

    public static void main(String args[]) {

    }
}