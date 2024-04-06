package taskTwo;

import java.util.Scanner;

public class AverageNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(averageNum(arr, 0, 0));
    }

    public static double averageNum(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        } else {
            sum += arr[index];
            return averageNum(arr, index + 1, sum);
        }
    }
}
