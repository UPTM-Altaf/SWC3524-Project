public class UPTMMarketingOptimization {

    // Cost Matrix (Adjacency Matrix)
    static int[][] costMatrix = {
        {0, 15, 25, 35},
        {15, 0, 30, 28},
        {25, 30, 0, 20},
        {35, 28, 20, 0}
    };

    // Location names
    static String[] locations = {"UPTM", "City B", "City C", "City D"};

    // Greedy TSP
    public static String greedyMCOP(int[][] dist)
    {
        int n = dist.length;
        boolean[] visited = new boolean[n];

        int current = 0;
        visited[current] = true;

        String route = locations[current];
        int totalCost = 0;

        for (int i = 1; i < n; i++)
        {
            int nextCity = -1;
            int minCost = 999999;

            for (int j = 0; j < n; j++)
            {
                if (!visited[j] && dist[current][j] < minCost)
                {
                    minCost = dist[current][j];
                    nextCity = j;
                }
            }

            visited[nextCity] = true;
            totalCost += minCost;
            route = route + " -> " + locations[nextCity];
            current = nextCity;
        }

        // Return to start
        totalCost += dist[current][0];
        route = route + " -> " + locations[0];

        return route + "\nTotal Cost: " + totalCost;
    }

    // Main method (IMPORTANT for BlueJ to run)
    public static void main(String[] args)
    {
        System.out.println(greedyMCOP(costMatrix));
    }
}