package core;

import dynamicconnectivity.QuickFind2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DynamicConnectivity {

    public static void main(String[] arg){
        try {
            Scanner scanner = Util.getScanner("large-uf.txt");
            int n = scanner.nextInt();
            System.out.println("N: "+n);
            QuickFind2 qf = new QuickFind2(n);
            while (scanner.hasNextInt()) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                qf.union(p, q);

            }
            qf.print();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
