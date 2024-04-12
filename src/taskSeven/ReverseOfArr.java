package taskSeven;

import java.util.Scanner;

public class ReverseOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        double startTime = System.nanoTime();
        reverseOfArr(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    /**
     * This method return the reverse version of given array.
     * It uses recursive approach.
     * Time complexity: O(n) ,where n is input number.
     * The recursive algorithm iterates through all number from n to 1,
     * resulting linear time complexity.
     *
     * @param arr   is array which reverse has to be found.
     * @param start is the index where array starts , first element.
     * @param end   is the index where array ends,last element.
     */
    public static void reverseOfArr(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseOfArr(arr, start + 1, end - 1);
    }
}
