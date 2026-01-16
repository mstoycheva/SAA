public class DijkstraAlgorithm {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 999, 5, 999},
                {999, 0, 1, 2, 999},
                {999, 999, 0, 999, 4},
                {999, 3, 9, 0, 2},
                {7, 999, 6, 999, 0}
        };

        dijkstra(graph, 0);
    }

    public static void dijkstra(int[][] graph, int startNode) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = 999;
            visited[i] = false;
        }
        dist[startNode] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = findMinDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 999 && dist[u] != 999 && (dist[u] + graph[u][v] < dist[v])) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printResult(dist, startNode);
    }

    private static int findMinDistance(int[] dist, boolean[] visited) {
        int min = 1000, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private static void printResult(int[] dist, int start) {
        System.out.println("Минимални разстояния от възел " + start + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("До възел " + i + " -> " + dist[i]);
        }
    }
}