package taskSix;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        double start = System.nanoTime();
        System.out.println(powerOfnum(num, power));
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    /**
     * This method calculates value of given number with its given power.
     * It uses recursive approach.
     * Time complexity: O(n), where n is input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting linear time complexity.
     *
     * @param num   is base number .
     * @param power is exponent to which base number is raised.
     * @return The result of raised number to exponent.
     */
    public static int powerOfnum(int num, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return num;
        } else {
            return num * powerOfnum(num, power - 1);
        }
    }
}
