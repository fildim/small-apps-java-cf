package testbed.ch4;

import java.util.Scanner;

/**
 * prints n vertical stars based on a number provided from stdin
 */
public class VerticalStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please provide an int");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}