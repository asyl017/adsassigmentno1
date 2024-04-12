package taskOne;

import java.util.Scanner;

public class MinNumberOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        double start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumNum(arr, 0, arr[0]));
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken " + duration + " mls");
    }

    /**
     * This methods returns minimal value in array  .
     * It uses recursive approach.
     * Time complexity: O(n), where n is input of number of array.
     * The recursive algorithm iterates all numbers through all numbers from n to 1,
     * resulting in linear time complexity.
     *
     * @param arr       is array from which minimal number has to be found.
     * @param index     is for control of iteration through all elements of array and to ensure correct termination
     *                  of the recursion.
     * @param minNumber is for tracking current minimal value found in the array during
     *                  recursive process.
     * @return The minimal value in array.
     **/
    public static int minimumNum(int[] arr, int index, int minNumber) {
        if (index == arr.length) {
            return minNumber;
        }
        if (arr[index] < minNumber) {
            minNumber = arr[index];
        }
        return minimumNum(arr, index + 1, minNumber);
    }
}