package taskThree;

import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = System.nanoTime();
        int num = sc.nextInt();
        boolean isPrime = isPrime(num, num / 2);
        if (isPrime) {
            System.out.println(" The given number is prime");
        } else {
            System.out.println(" The given number is composite");
        }
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("time taken " + duration + "  mls");
    }

    /**
     * This method identifies is number composite or prime.
     * It uses recursive approach.
     * Time complexity: O(n) where n is input number.
     * The resursive algorithm iterates through all number from n to 1,
     * resulting in linear time complexity.
     *
     * @param num is number for which checking is it prime or composite.
     * @param div is for checking is number divisible by any number other than 1 and itself.
     * @return it retuns true if number prime adn false if number is composite.
     */
    public static boolean isPrime(int num, int div) {
        if (num <= 1) {
            return false;
        }
        if (div == 1) {
            return true;
        }
        if (num / div == 0) {
            return false;
        }
        return isPrime(num, div + 1);
    }
}
