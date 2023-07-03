package main.java.Optionals_DateApi;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDaysCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 6, 2);

        // Get the last day of the month
        LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

        // Calculate the number of working days
        int workingDays = 0;
        LocalDate tempDate = currentDate;
        while (tempDate.isBefore(lastDayOfMonth) || tempDate.isEqual(lastDayOfMonth)) {
            if (tempDate.getDayOfWeek() != DayOfWeek.SATURDAY && tempDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            tempDate = tempDate.plus(1, ChronoUnit.DAYS);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}
