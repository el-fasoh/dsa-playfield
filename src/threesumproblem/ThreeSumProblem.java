package threesumproblem;

import core.Util;

import java.util.Scanner;

public class ThreeSumProblem {
    public static void main(String[] args) {

//        try {
//            int arraySize = Integer.parseInt(args[1]);
//            int[] array = new int[arraySize];
//            Scanner scanner = Util.getScanner(args[0]);
//            int index = 0;
//
//            while (scanner.hasNextInt()) {
//                array[index] = scanner.nextInt();
//                index++;
//            }
//
//            int i = 0, j = i + 2;
//            int count = 0;
//            while (j < array.length) {
//                if ((array[i] + array[i + 1] + array[j]) == 0) {
//                    count++;
//                }
//                i++;
//                j++;
//            }
//            System.out.println(count);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        oneSum();
    }

    static int[] array = {1, 3, 5, 6, 5, 6, 3, 6, 2};

    private static void oneSum() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void twoSum() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    /*
        variabale declaration 3
        assignment 3
        less than N(N+1)
        N
     */

    /*
    declaration -> 2
    condition check -> n + n+1
     */
}
