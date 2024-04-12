package taskTen;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double start = System.nanoTime();
        System.out.println(grComDer(a, b));
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    /**
     * This method calculates gcd of 2 given numbers.
     * It uses recursive approach.
     * Time complexity: O(n) where n is input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting linear time complexity.
     *
     * @param a is first number  which gcd with parameter b has to be found.
     * @param b is second number which gcd with parameter a has to be found.
     * @return gcd of a and b.
     */
    public static int grComDer(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return grComDer(b, a % b);
        }
    }
}
