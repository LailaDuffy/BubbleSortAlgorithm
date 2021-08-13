package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numberArray1 = {3, 14, 6, 0, 10, 5};
        int[] numberArray2 = {8, 12, 4, 18, 1, 7};
        int[] numberArray3 = {99, 34, -57, 23, 9, 1};
        int[] numberArray4 = {7, 45, 8, 79, 21, 7};
        int[] numberArray5 = {5, -4, 6, 3, 42, 6};

        System.out.println("Before bubble sort: " + Arrays.toString(numberArray1));
        bubble_sort(numberArray1);
        System.out.println("After bubble sort: " + Arrays.toString(numberArray1));
        System.out.println();
        System.out.println("Before bubble sort: " + Arrays.toString(numberArray2));
        bubble_sort(numberArray2);
        System.out.println("After bubble sort: " + Arrays.toString(numberArray2));
        System.out.println();
        System.out.println("Before bubble sort: " + Arrays.toString(numberArray3));
        bubble_sort(numberArray3);
        System.out.println("After bubble sort: " + Arrays.toString(numberArray3));
        System.out.println();
        System.out.println("Before bubble sort: " + Arrays.toString(numberArray4));
        bubble_sort(numberArray4);
        System.out.println("After bubble sort: " + Arrays.toString(numberArray4));
        System.out.println();
        System.out.println("Before bubble sort: " + Arrays.toString(numberArray5));
        bubble_sort(numberArray5);
        System.out.println("After bubble sort: " + Arrays.toString(numberArray5));

    }

    public static void bubble_sort(int[] numberArray) {
        int sorter;

        for (int k = 0; k < numberArray.length; k++) { // to go through the whole array, e.g. indexes 0 to 5
            for (int i = 0; i < numberArray.length - k - 1; i++) { // to go through the array that has not been looked at yet, e.g. indexes 0 to 4
                if (numberArray[i] > numberArray[i + 1]) {
                    sorter = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = sorter;
                }
            }
        }

    }
}
