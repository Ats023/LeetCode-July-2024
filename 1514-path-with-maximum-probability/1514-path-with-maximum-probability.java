class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] maxProb = new double[n];
        maxProb[start_node] = 1;
        for(int i=0; i<n-1; i++) {
            boolean f = false;
            for(int j=0; j<edges.length; j++) {
                int u = edges[j][0], v = edges[j][1];
                double prob = succProb[j];
                if(maxProb[u]*prob>maxProb[v]) {
                    maxProb[v] = maxProb[u]*prob;
                    f = true;
                }
                if(maxProb[v]*prob>maxProb[u]) {
                    maxProb[u] = maxProb[v]*prob;
                    f = true;
                }
            }
            if(!f) break;
        }
        return maxProb[end_node];
    }
}