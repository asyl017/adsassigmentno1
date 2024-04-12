package taskEight;

import java.util.Scanner;

public class DigitsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double start = System.nanoTime();
        boolean result = onlyDigits(str);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        double end = System.nanoTime();
        double duration = (end - start)/1000000;
        System.out.println("Time taken " + duration + " mls");
    }

    /**
     * This method identifies does the given string contains only digits or does not.
     * It uses recursive approach.
     * Time complexity: O(n) where n is input string line.
     * The recursive algorithm iterates through all elements of string from n to 1, resulting
     * linear time complexity.
     * @param str is string which has to be checked for containing only digits or not.
     * @return True if string contains only digits and false if it does not.
     */
    public static boolean onlyDigits(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return Character.isDigit(str.charAt(0));
        } else {
            return Character.isDigit(str.charAt(0)) && onlyDigits(str.substring(1));
        }
    }
}
