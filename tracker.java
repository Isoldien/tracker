
/**
 * @author Habibur Rahman (Isoldien) - habib@isoldien.com
 * @version 0.0.1
 * @since 2025-11-24
 * @description the main class for the tracker
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (yyyy-MM-dd): ");

        String dateStr = scanner.nextLine();

        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.parse(dateStr);

        int daysBetween = (int) ChronoUnit.DAYS.between(date, today);
        System.out.println("Days between: " + daysBetween);

        scanner.close();

        int prayers = daysBetween * 5;
        System.out.println("Prayers left: " + prayers);
    }

}
