package leet;

import java.util.*;

class GFG {

    // returns true if there is triplet 
    // with sum equal to 'sum' present 
    // in A[]. Also, prints the triplet 
    static boolean find3Numbers(int A[], int arr_size, int sum) {
        // Fix the first element as A[i] 
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1] 
            // with sum equal to sum - A[i] 
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (s.contains(curr_sum - A[j])) {
                    System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
                    // return true;
                }
                s.add(A[j]);
            }
        }

        // If we reach here, then no triplet was found 
        return false;
    }

    /* Driver code */
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8, 0, -23};
        int sum = 22;
        int arr_size = A.length;

        //find3Numbers(A, arr_size, sum);
        System.out.println(findNumbers(A, 22).toString());
    }

    static List<List<Integer>> findNumbers(int nums[], int sum) {
        Arrays.sort(nums);
        List<List<Integer>> items = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            HashSet<Integer> integers = new HashSet<>();
            int leftSum = sum - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (integers.contains(leftSum - nums[j])) {
                    List<Integer> sums = new ArrayList<>();
                    sums.add(nums[i]);
                    sums.add(nums[j]);
                    sums.add(leftSum - nums[j]);
                    if (!items.contains(sums))
                        items.add(sums);
                }
                integers.add(nums[j]);
            }
        }
        return items;
    }
} 