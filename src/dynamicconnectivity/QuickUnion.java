package dynamicconnectivity;

public class QuickUnion {

    int ids[];

    public QuickUnion(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public void union(int p, int q) {
       int rtp = root(p);
       int rtq = root(q);
       ids[rtp] = rtq;
    }

    private int root(int i) {
        while(i != ids[i]){
            i = ids[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
