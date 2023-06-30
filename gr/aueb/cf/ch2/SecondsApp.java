package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβάζει ώρες, λεπτά και δευτερόλεπτα
 * και μετατρέπει σε δευτερόλεπτα.
 */

public class SecondsApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours, minutes and seconds");
        inputHours = scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();

        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.forLanguageTag("el"), "%d hours, %d minutes, %d seconds = %,d total seconds", inputHours, inputMinutes, inputSeconds, totalSeconds);

    }
}
