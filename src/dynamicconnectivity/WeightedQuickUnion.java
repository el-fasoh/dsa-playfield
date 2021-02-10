package dynamicconnectivity;

import java.util.Arrays;

public class WeightedQuickUnion {

    int ids[];
    int sizes[];

    public WeightedQuickUnion(int n) {
        ids = new int[n];
        sizes = new int[n];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
            sizes[i] = 0;
        }
    }

    private int root(int i) {
        while (i != ids[i])
            i = ids[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rtp = root(p);
        int rtq = root(q);

        if(rtp == rtq) return;

        if (sizes[rtp] > sizes[rtq]) {
            ids[rtp] = rtq;
            sizes[rtq] += sizes[rtp];
        } else {
            ids[rtq] = rtp;
            sizes[rtp] += sizes[rtq];
        }
    }

    public void print() {
        System.out.print(Arrays.toString(ids));
    }

}
