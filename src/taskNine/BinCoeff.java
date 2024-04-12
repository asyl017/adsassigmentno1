package taskNine;

import java.util.Scanner;

public class BinCoeff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double start = System.nanoTime();
        System.out.println(binCoeff(n, k));
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    /**
     * This method calculates binomial coefficient of given number.
     * It uses recursive approach.
     * Time complexity: O(2^n) ,where n is input number.
     * The recursive algorithm iterates through all numbers from n to 1 ,
     * resulting exponential time complexity.
     *
     * @param n the total number of items.
     * @param k the number of items to choose from the total.
     * @return binomial coefficient of given values of n and k.
     */
    public static int binCoeff(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else {
            return binCoeff(n - 1, k - 1) + binCoeff(n - 1, k);
        }
    }
}
