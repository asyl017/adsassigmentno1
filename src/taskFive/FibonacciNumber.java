package taskFive;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = System.nanoTime();
        int num = sc.nextInt();
        System.out.println(fibonacciNum(num));
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken " + duration + " mls");
    }

    /**
     * This method calculates fibonacci number of giver value.
     * It uses recursive approach.
     * Time complexity: O(n) ,where n is input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting in linear time complexity.
     *
     * @param num The number for which fibonacci number is to be calculated.
     * @return fibonacci number of the given number.
     */
    public static int fibonacciNum(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return (num - 1) + (num - 2);
        }
    }
}
