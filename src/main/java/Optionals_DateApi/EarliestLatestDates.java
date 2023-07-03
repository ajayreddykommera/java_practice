package Optionals_DateApi;
import java.time.LocalDate;
import java.util.List;

public class EarliestLatestDates {

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 2, 2),
                LocalDate.of(2023, 3, 3),
                LocalDate.of(2023, 4, 4),
                LocalDate.of(2023, 5, 5)
        );

        LocalDate earliestDate = dates.stream().min(LocalDate::compareTo).get();
        LocalDate latestDate = dates.stream().max(LocalDate::compareTo).get();

        System.out.println("The earliest date is: " + earliestDate);
        System.out.println("The latest date is: " + latestDate);
    }
}

