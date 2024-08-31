package com.dsa.javalearning.sorting;

public class InsetionSort {
    public static void main(String[] args) {
        int[] arr = {1, 18, 19, 10, 5, 6322, 63};
        insertionSort(arr);
        printArr(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

