package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών αριθμών που δίνει ο χρήστης
 */

public class PositivesCountApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a number");
        num = scanner.nextInt();

        while (num >= 0)
        {
            positivesCount++;
            System.out.println("Please give a number");
            num = scanner.nextInt();
        }

        System.out.println("Positive-count: " + positivesCount);


    }
}
