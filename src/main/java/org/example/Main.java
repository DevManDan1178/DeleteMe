package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 5, 2, 1, 4};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Magical sorting function O(n^2) for int[]
     *
     * @param nums int[] to sort
     */
    public static void bubblesort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;

                }
            }
        }
    }

    /**
     * Magical sorting function O(n^2) for int[]
     *
     * @param nums      int[] to sort
     * @param ascending sort by ascending ? or not ?
     */
    public static void bubblesort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if ((ascending && nums[j] > nums[j + 1]) || (!ascending && nums[j] < nums[j + 1])) {
                    int t = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }

    /**
     * Magical sorting function O(n^2) for int[]
     * @param nums int[] to sort
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = nums.length - 1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
