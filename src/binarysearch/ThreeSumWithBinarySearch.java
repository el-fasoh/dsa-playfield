package binarysearch;

import core.Util;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreeSumWithBinarySearch {

    //Note: Pass the file name and size as arguments to main.
    public static void main(String[] args) {

        try {
            int arraySize = Integer.parseInt(args[1]);
            int[] array = new int[arraySize];
            Scanner scanner = Util.getScanner(args[0]);
            int index = 0;

            while (scanner.hasNextInt()) {
                array[index] = scanner.nextInt();
                index++;
            }
            long start = Calendar.getInstance().getTimeInMillis();
            System.out.println(countThreeSumWithBruteForce(array, 0));
            long end = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time taken in (s): BRUTEFORCE" + TimeUnit.MILLISECONDS.toSeconds(end - start)); //for  8k takes upto 141s

            start = Calendar.getInstance().getTimeInMillis();
            System.out.println(countThreeSumsWithBinarySearch(array, 0));
            end = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time taken in (s): WITH BINARY-SEARCH" + TimeUnit.MILLISECONDS.toSeconds(end - start)); //for  8k takes upto 1s

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int countThreeSumsWithBinarySearch(int[] items, int sum) {
        Arrays.sort(items);
        int count = 0;
        for (int i = 0; i < items.length - 2; i++) {
            for (int j = i + 1; j < items.length; j++) {
                int diff = sum - (items[i] + items[j]);
                int index = BinarySearch.search(items, diff);
                if (index > j) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countThreeSumWithBruteForce(int[] items, int sum) {
        int count = 0;
        for (int i = 0; i < items.length - 2; i++) {
            for (int j = i + 1; j < items.length; j++) {
                for (int k = j + 1; k < items.length; k++) {
                    if (items[i] + items[j] + items[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
