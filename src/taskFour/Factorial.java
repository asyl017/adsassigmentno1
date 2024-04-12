package taskFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = factorial(num);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The factorial of " + num + " is " + result);
        System.out.println("The duration: " + duration + " mls ");

    }

    /**
     * This method calculated factorial of a given number.
     * It uses recursive approach .
     * Time complexity: O(n), where n is input number.
     * The recursive algorithm iterates numbers all n to 1,
     * resulting in linear time complexity.
     *
     * @param num number for which factorial is calculated
     * @return The factorial of given number
     */
    public static int factorial(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
