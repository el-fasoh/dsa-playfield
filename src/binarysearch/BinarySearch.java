package binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 8, 4, 3, 5, 7, 9, 10, 34, 90, 15};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(searchRecursive(array, 3, 0, array.length - 1));
    }

    private static int search(int[] items, int key) {
        int low = 0, high = items.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < items[mid]) {
                high = mid - 1;
            } else if (key > items[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int searchRecursive(int[] items, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (items[mid] == key)
                return mid;
            if (items[mid] > key) {
                return searchRecursive(items, key, low, mid - 1);
            }
            return searchRecursive(items, key, mid + 1, high);
        }
        return -1;
    }
}
