package leet;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> items = new ArrayList();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> sums = new ArrayList<>();
                        sums.add(nums[i]);
                        sums.add(nums[j]);
                        sums.add(nums[k]);
                        Collections.sort(sums);
                        if (!items.contains(sums))
                            items.add(sums);
                    }
                }
            }
        }

        int value = someNumber("dfdf");

        return items;
    }

    private int someNumber(String text) throws NumberFormatException{
        return Integer.parseInt(text);
    }
}