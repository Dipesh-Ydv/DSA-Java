package com.dipesh.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 0, -1, 3};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minInd = minIndex(arr, i, arr.length);
            if (minInd != i) {
                swap(arr, minInd , i);
            }
        }
    }

    static int minIndex(int[] arr, int start, int end) {
        int min = start;

        for (int i = start; i < end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
