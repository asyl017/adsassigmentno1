package taskOne;

import java.util.Scanner;

public class MinNumberOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumNum(arr, 0, arr[0]));
    }

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