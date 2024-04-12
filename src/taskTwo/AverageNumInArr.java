package taskTwo;

import java.util.Scanner;

public class AverageNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double startTime = System.nanoTime();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(averageNum(arr, 0, 0));
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    /**
     * This method calculates average value of array.
     * It uses recursive approach.
     * Time complexity: O(n),where n is input number of array.
     * The recursive algorithm iterates all numbers through n to 1 ,
     * resulting in linear time complexity.
     *
     * @param arr   is array from which average number has to be found.
     * @param index is for control of iterartion through all elements of array and to ensure the
     *              correctness of termination.
     * @param sum   to keep tracking of the sum of elements of array ,each time method is called recursively
     *              current element of array is added to the sum.
     * @return The average value of array.
     */
    public static double averageNum(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        } else {
            sum += arr[index];
            return averageNum(arr, index + 1, sum);
        }
    }
}
