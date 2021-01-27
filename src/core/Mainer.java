package core;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mainer {

    public static void main(String[] arg){
        try {
            Scanner scanner = Util.getScanner("tiny-uf.txt");
            int n = scanner.nextInt();
            System.out.println("N: "+n);
            while (scanner.hasNextInt()) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();

                System.out.println(p + " " + q);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
